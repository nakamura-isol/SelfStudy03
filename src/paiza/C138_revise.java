package paiza;

import java.util.Scanner;

public class C138_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int headCount = Integer.parseInt(sc.nextLine());

		int[] scoreArray = new int[headCount];

		for (int i = 0; i < headCount; i++) {
			int score = Integer.parseInt(sc.nextLine());

			scoreArray[i] = score;
		}

		for (int i = 0; i < headCount; i++) {
			// 自分より大きい人数 + 1
			int rank = 1;
			for (int j = 0; j < headCount; j++) {
				// 「大きい」だけ数える
				if (scoreArray[j] > scoreArray[i]) {
					rank++;
				}

			}
			System.out.println(rank);
		}

	}

}
