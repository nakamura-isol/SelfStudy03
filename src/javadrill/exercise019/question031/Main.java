package javadrill.exercise019.question031;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/javadrill";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "matatavi022";

	public static void main(String[] args) {
		try {
			// ユーザーがアカウント間で資金を移動する例
			transferFunds(123456, 789012, 1000.0);
			System.out.println("取引が成功しました。");
		} catch (SQLException | InsufficientFundsException e) {
			System.err.println("取引エラー: " + e.getMessage());
		}
	}
	

	/**
	 * 銀行取引メソッド
	 */
	private static void transferFunds(int fromAccount, int toAccount, double money)
			throws SQLException, InsufficientFundsException {
		// データベースへの接続
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			// トランザクションの開始
			connection.setAutoCommit(false);

			double balance = getAccountBalance(connection, fromAccount);

		}

	}

	/**
	 * 指定されたアカウントの残高を取得するメソッド
	 * @param connection
	 * @param accountNumber
	 * @return
	 * @throws SQLException
	 */
	private static double getAccountBalance(Connection connection, int accountNumber) throws SQLException {
		String query = "SELECT balance FROM accounts WHERE account_number = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setDouble(1, accountNumber);
			var resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return resultSet.getDouble("balance");
			}

		}
		throw new SQLException("アカウントが見つかりません。");

	}

	/**
	 * 指定されたアカウントの残高を更新するメソッド
	 * @param connection
	 * @param accountNumber
	 * @param newBalance
	 * @throws SQLException
	 */
	private static void updateAccountBalance(Connection connection, int accountNumber, double newBalance)
			throws SQLException {
		String query = "UPDATE accounts SET balance = ? WHERE account_number = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setDouble(1, newBalance);
			preparedStatement.setInt(2, accountNumber);
			int affectedRows = preparedStatement.executeUpdate();
			if (affectedRows == 0) {
				throw new SQLException("アカウントが見つかりません。");
			}
		}

	}

}
