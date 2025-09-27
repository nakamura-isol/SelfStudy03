package paiza;

import java.util.Scanner;

public class C101_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luckyDay = sc.nextInt();
		int luckyDayCount = 0;

		for (int i = 0; i < 365; i++) {
			String stringI = String.valueOf(i);

			String stringLuckyDay = String.valueOf(luckyDay);
			if (stringI.contains(stringLuckyDay)) {
				luckyDayCount++;
			}
		}

		System.out.println(luckyDayCount);

	}

}
