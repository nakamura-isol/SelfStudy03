package javadrill.exercise019.question006;

import java.util.Scanner;

public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			// ユーザーに割られる数を入力させる
			System.out.print("割られる数を入力してください: ");
			Scanner scanner = new Scanner(System.in);

			int dividend = getInput();

			// ユーザーに割る数を入力させる
			System.out.print("割る数を入力してください: ");

			int divisor = getInput();

			// 除算を実行
			divide(dividend, divisor);

		} catch (NumberFormatException e) {
			// 数字以外が入力された場合のエラーハンドリング
			System.out.println("エラー: 数字以外が入力されました。");
		} catch (MyCustomException e) {
			// カスタム例外が発生した場合のエラーハンドリング
			System.out.println("エラー: " + e.getMessage());
		}
	}

	// 割り算を行うメソッド
	static void divide(int num1, int num2) throws MyCustomException {
		if (num2 == 0) {
			throw new MyCustomException("0で割ることはできません。");
		}
		// 除算結果を表示
		int result = num1 / num2;
		System.out.println("結果: " + result);
	}

	// ユーザーからの数値入力を受け付けるメソッド
	static int getInput() throws NumberFormatException {
		Scanner scanner = new Scanner(System.in);
		// 入力された文字列を整数に変換して返す
		return Integer.parseInt(scanner.nextLine());
	}
}
