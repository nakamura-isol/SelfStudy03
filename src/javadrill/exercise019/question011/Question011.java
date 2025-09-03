package javadrill.exercise019.question011;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("最初の整数を入力してください。");
		try {
			int num1 = sc.nextInt();

			System.out.println("2つ目の整数を入力してください。");
			int num2 = sc.nextInt();
			int result = num1 / num2;

			// 0で割り算をしようとした場合の例外処理
			// 上記の割り算で自動発生するので、以下は明示的であり、重複
			if (num2 == 0) {
				throw new ArithmeticException("エラー: 0で割り算はできません。");
			}

			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0で割ることはできません。");
		} catch (InputMismatchException e) {
			System.out.println("整数以外の数字が入力されました。");
		}

	}


}
