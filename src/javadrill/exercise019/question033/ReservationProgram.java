package javadrill.exercise019.question033;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 予約管理プログラム
 */
public class ReservationProgram {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/reservation";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "matatavi022";


	public static void main(String[] args) {
		try {
			makeReservation("多目的室", "20250905");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	/**
	 * 予約実行メソッド
	 */
	private static void makeReservation(String space, String date) throws SQLException {
		// データベースへの接続
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);) {
			// トランザクション開始
			connection.setAutoCommit(false);
			// 予約の重複チェック
			if (!isReservationAvailable(connection, space, date)) {
				connection.rollback();
				System.out.println("すでに予約が入ってます。");
				return;
			} else {
				insertReservation(connection, space, date);
				// トランザクションのコミット
				connection.commit();
				System.out.println("予約が完了しました。");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 予約の重複チェックを行うメソッド
	 * @return
	 */
	private static boolean isReservationAvailable(Connection connection, String space, String date)
			throws SQLException {
		// テーブルから、条件（施設名と日付）が一致する行数を数える
		// COUNT(*) はマッチした件数を返すので、0なら予約なし、1以上なら予約済み
		String sql = "SELECT COUNT(*) FROM reservations WHERE space = ? AND date = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, space);
			preparedStatement.setString(2, date);

			// 予約がある場合はfalseを返す
			// 希望スペースの予約希望日の検索結果が0であればいい
			// return preparedStatement.executeQuery().getInt(1) == 0;
			try (ResultSet rs = preparedStatement.executeQuery()) {
				// 必須
				rs.next();
				// 0件なら予約可能
				return rs.getInt(1) == 0;
			}

		}
	}

	// 予約をデータベースに登録するメソッド
	private static void insertReservation(Connection connection, String space, String date)
			throws SQLException {
		String sql = "INSERT INTO reservations (space, date) VALUES (?, ?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, space);
			preparedStatement.setString(2, date);

			preparedStatement.executeUpdate();
		}
	}

	// /**
	// * 指定された施設を取得する
	// * @return
	// * @throws SQLException
	// */
	// private static String getTargetSpace(Connection connection, String space,
	// String date) throws SQLException {
	// // 施設名と日時を条件に結果を取得するSQL文
	// // 日時はnullか自分の希望日時以外ならOK
	// String sql = "SELECT space FROM ivents WHERE space = ? and date =? ";
	// try (PreparedStatement statement = connection.prepareStatement(sql)) {
	// statement.setString(1, space);
	// statement.setString(2, date);
	// // SQLの実行
	// var resultSet = statement.executeQuery();
	// if (resultSet.next()) {
	// return resultSet.getString("space");
	// } else {
	// throw new SQLException("スペースが見つかりませんでした。");
	// }
	//
	// }
	// }

	// /**
	// * 予約登録メソッド
	// * @throws SQLException
	// */
	// private static void registerReservation(Connection connection, String
	// space, String date) throws SQLException {
	// //
	// String sql = "UPDATE space SET date = ? WHERE space = ? and date =? ";
	// try (PreparedStatement statement = connection.prepareStatement(sql)) {
	// statement.setString(1, date);
	// statement.setString(2, space);
	// statement.setString(3, date);
	// // SQLの実行
	// statement.executeUpdate();
	// // SQLの実行
	// statement.executeUpdate();
	// }
	// }

}
