package paiza;

import java.util.Scanner;

public class C062_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dishCount = Integer.parseInt(sc.nextLine());

		String[] sushiArray = new String[dishCount];
		for (int i = 0; i < dishCount; i++) {
			sushiArray[i] = sc.nextLine();
		}

		int melonCount = 0;
		// 次にメロンを取れる皿番号（1始まり）
		int nextAvailable = 1;
		for (int i = 0; i < sushiArray.length; i++) {
			// 皿の位置を1始まりに
			int dishPosition = i + 1;
			if (sushiArray[i].equals("melon") && dishPosition >= nextAvailable) {
				// 取る
				melonCount++;
				// 以後10皿(= pos+1..pos+10)は取れない → 最短はpos+1
				nextAvailable = dishPosition + 11;

			}
		}

		System.out.println(melonCount);

	}

}
