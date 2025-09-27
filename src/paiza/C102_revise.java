package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C102_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfADays = Integer.parseInt(sc.nextLine());

		List<Integer> aDaysList = new ArrayList<>();
		for (int i = 0; i < numOfADays; i++) {
			int aDay = Integer.parseInt(sc.nextLine());
			aDaysList.add(aDay);
		}
		int numOfBDays = Integer.parseInt(sc.nextLine());
		List<Integer> bDaysList = new ArrayList<>();
		for (int i = 0; i < numOfBDays; i++) {
			int bDay = Integer.parseInt(sc.nextLine());
			bDaysList.add(bDay);
		}
		Map<Integer, String> aAndBMap = new TreeMap<>();

		int duplicateCount = 0;
		for (int i = 1; i <= 31; i++) {
			boolean a = aDaysList.contains(i);
			boolean b = bDaysList.contains(i);
			if (a && b) {
				// 被りのときだけ増やす
				duplicateCount++;
				// 被り回数が偶数ならA, 奇数ならB
				String pickedType = null;
				if (duplicateCount % 2 == 0) {
					pickedType = "B";
				} else {
					pickedType = "A";
				}
				aAndBMap.put(i, pickedType);

			} else if (a) {
				aAndBMap.put(i, "A");
			} else if (b) {
				aAndBMap.put(i, "B");
			} else {
				aAndBMap.put(i, "x");
			}

		}

		for (Integer key : aAndBMap.keySet()) {
			System.out.println(aAndBMap.get(key));
		}

	}

}
