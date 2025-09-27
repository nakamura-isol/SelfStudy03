package paiza;

import java.util.Scanner;

public class C032_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int purchaseAmount = Integer.parseInt(sc.nextLine());

		int itemType = 0;
		int price = 0;

		// 種類ごとの合計金額の配列 [0:食料品, 1:書籍, 2:衣類, 3:その他]
		int[] TotalPriceArray = new int[4];

		for (int i = 0; i < purchaseAmount; i++) {
			String[] secondLineArray = sc.nextLine().split(" ");
			itemType = Integer.parseInt(secondLineArray[0]);
			price = Integer.parseInt(secondLineArray[1]);
			// まず種類ごとに計算して配列にする
			TotalPriceArray[itemType] += price;

		}

		// for (int i = 0; i < TotalPriceArray.length; i++) {
		// System.out.println(TotalPriceArray[i]);
		//
		// }

		// 合計金額に対してだけ切り捨て（整数割り算でOK）
		int totalGetPoint = 0;
		// 食料品
		totalGetPoint += (TotalPriceArray[0] / 100) * 5;
		// 書籍
		totalGetPoint += (TotalPriceArray[1] / 100) * 3;
		// 衣類
		totalGetPoint += (TotalPriceArray[2] / 100) * 2;
		// その他
		totalGetPoint += (TotalPriceArray[3] / 100) * 1;

		System.out.println(totalGetPoint);

	}

}
