package paiza;

import java.util.Scanner;

public class C123_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		// 参加者人数
		int attendance = Integer.parseInt(firstLine);

		// 年齢
		int[] age = new int[attendance];
		for (int i = 0; i < attendance; i++) {
			age[i] = Integer.parseInt(sc.nextLine());
		}
		// 命令の数
		int countOfInstruction = Integer.parseInt(sc.nextLine());

		// 各人の豆受取数
		int[] beans = new int[attendance];

		// 命令を順に適用： startIndex, finalIndexに入る人へ beanAmountを加算
		for (int i = 0; i < countOfInstruction; i++) {
			String[] detailOfInstruction = sc.nextLine().split(" ");
			int startIndex = Integer.parseInt(detailOfInstruction[0]);
			int finalIndex = Integer.parseInt(detailOfInstruction[1]);
			int beanAmount = Integer.parseInt(detailOfInstruction[2]);

			// 対象者に豆を渡す
			for (int j = startIndex - 1; j <= finalIndex - 1; j++) {
				// 年齢以上の個数は受け取らない
				// 今の保有数から見て、あと何個まで受け取れるか
				int receivedBean = age[j] - beans[j];

				// まだ上限に届いていないなら
				if (receivedBean > 0) {
					// 今回配るbeanAmount個と残りreceivedBean個の小さい方だけ加算
					beans[j] += Math.min(beanAmount, receivedBean);
				}
			}

		}
		// 出力
		for (int i = 0; i < beans.length; i++) {
			System.out.println(beans[i]);
		}

	}

}
