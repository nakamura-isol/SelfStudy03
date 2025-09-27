package paiza;

import java.util.Scanner;

public class C097_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] lottoArray = line.split(" ");
		int attendance = 0;
		int multipleOfA = 0;
		int multipleOfB = 0;

		for (int i = 0; i < lottoArray.length; i++) {
			attendance = Integer.parseInt(lottoArray[0]);
			multipleOfA = Integer.parseInt(lottoArray[1]);
			multipleOfB = Integer.parseInt(lottoArray[2]);

		}


		String[] finalLottoArray = new String[attendance];
		for (int i = 1; i <= attendance; i++) {

			boolean a = (i % multipleOfA == 0);
			boolean b = (i % multipleOfB == 0);

			if (a && b) {
				finalLottoArray[i-1] = "AB";
			} else if (a) {
				finalLottoArray[i-1] = "A";
			} else if (b) {
				finalLottoArray[i-1] = "B";
			} else {
				finalLottoArray[i-1] = "N";
			}

		}
		// 出力
		for (int i = 0; i < finalLottoArray.length; i++) {
			System.out.println(finalLottoArray[i]);

		}

	}

}
