package javadrill.exercise019.question026;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\highe\\Documents\\gitproject\\dog.txt";
		try {
			processFile(filePath);
		} catch (CustomFileReadException e) {
			System.out.println("エラーコード: " + e.getErrorCode());
			System.out.println("エラーメッセージ: " + e.getMessage());
		}

	}

	private static void processFile(String filePath) throws CustomFileReadException {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			// 仮の条件: ファイルから読み取るデータが期待される形式と異なる場合
			if (line == null || !line.contains("expected_pattern")) {
				throw new CustomFileReadException("ファイルの形式が期待されるものと異なります", 1001);
			}
			// ファイルのデータを処理するロジックをここに追加
			System.out.println("ファイルデータ: " + line);
		} catch (IOException e) {
			// ファイルが見つからない場合
			throw new CustomFileReadException("ファイルが見つかりません", 1002);
		}
	}
}