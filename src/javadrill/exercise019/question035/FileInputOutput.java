package javadrill.exercise019.question035;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * ファイルの読み書きをする
 * ファイルの書き込み中にエラーが発生した場合、トランザクションをロールバックし、エラーメッセージを表示
 * 同一ディレクトリに一時ファイルを作り、成功時だけ置換
 * 
 */
public class FileInputOutput {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\highe\\Documents\\dog.txt";

		try (FileTransaction fileTransaction = new FileTransaction(filePath)) {
			fileTransaction.writeToFile("ポメラニアン");
			fileTransaction.commit();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static class FileTransaction implements AutoCloseable {

		private final String filePath;
		private boolean committed;

		FileTransaction(String filePath) {
			this.filePath = filePath;
			this.committed = false;
		}

		public void writeToFile(String content) throws IOException {
			// ロールバック確認のための記述なのでコメントアウト
//			boolean fail = true;
			// 直接本番に書かず、一時ファイルにのみ書く
			try (FileWriter fw = new FileWriter(filePath + ".tmp")) {
				fw.write(content);
//				if (fail) {
//					throw new IOException("処理に失敗しました。");
//				}
			}
		}

		/**
		 * トランザクション正常処理
		 * @throws IOException
		 */
		public void commit() throws IOException {
			// StandardCopyOption.REPLACE_EXISTINGで既存ファイルを上書き
			Files.move(
					Paths.get(filePath + ".tmp"),
					Paths.get(filePath),
					StandardCopyOption.REPLACE_EXISTING);
			committed = true;
		}

		/**
		 * トランザクションロールバック処理
		 */
		@Override
		public void close() throws IOException {
			// トランザクションのロールバック処理
			if (!committed) {
				// 未コミット→一時ファイルを破棄→ロールバック
				Files.deleteIfExists(Paths.get(filePath + ".tmp"));
				System.out.println("トランザクションがロールバックされました。");

			}

		}

	}

}
