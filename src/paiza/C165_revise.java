package paiza;

import java.util.Scanner;

public class C165_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int curryRiceAmount = Integer.parseInt(sc.nextLine());
		String[] curryRiceDetailArray = sc.nextLine().split(" ");

		// 既にその番号のカレーとライスを使ったか
		boolean[] used = new boolean[curryRiceAmount];
		StringBuilder sb = new StringBuilder();

		int curryRiceCount = 0;
		// i個目までに出た中から、最古のカレーとライスを探して1皿だけ作る
		for (int i = 0; i < curryRiceAmount; i++) {
			int curryIndex = -1;
			int riceIndex = -1;

			// ここが内側ループ（最古を探す）
			// 外側はi個目まで進んでいる。その時点で使えるカレーもライスも0~i個目の分。
			for (int j = 0; j <= i; j++) {
				// curryIndexが-1で中身もCで、used配列がfalseならjを入れる
				if (curryIndex == -1 && curryRiceDetailArray[j].equals("C") && !used[j]) {
					curryIndex = j;
				}
				if (riceIndex == -1 && curryRiceDetailArray[j].equals("R") && !used[j]) {
					riceIndex = j;
				}
				if (curryIndex != -1 && riceIndex != -1) {
					break;
				}

			}
			// curryIndexとriceIndexが見つかったらusedのcurryIndexとriceIndexをtrueにする
			if (curryIndex != -1 && riceIndex != -1) {
				curryRiceCount++;
				// 消費済みにする
				used[curryIndex] = true;
				used[riceIndex] = true;
				sb.append(curryIndex + 1).append(" ").append(riceIndex + 1).append("\n");
			}
		}
		System.out.println(curryRiceCount);
		System.out.print(sb.toString());

	}

}
