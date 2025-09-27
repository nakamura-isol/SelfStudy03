package paiza;

import java.util.Scanner;

public class C170_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		String[] firstLineArray = firstLine.split(" ");

		int shoppingCount = 0;
		int goalPoint = 0;

		int pointRate = 100;
		int totalPoint = 0;

		for (int i = 0; i < firstLineArray.length; i++) {
			shoppingCount = Integer.parseInt(firstLineArray[0]);
			goalPoint = Integer.parseInt(firstLineArray[1]);

		}

		String secondLine = sc.nextLine();
		String[] secondLineArray = secondLine.split(" ");

		int[] pricaArray = new int[shoppingCount];

		for (int i = 0; i < secondLineArray.length; i++) {
			int price = Integer.parseInt(secondLineArray[i]);
			pricaArray[i] = price;

			double getPoint = (double) pricaArray[i] / (double) pointRate;
			int intGetPoint = (int) Math.floor(getPoint);
			totalPoint += intGetPoint;

		}
		if (totalPoint >= goalPoint) {
			System.out.println(0);
			return;

		}
		int needPoint = goalPoint - totalPoint;
		if (needPoint <= 0) {
			System.out.println(0);
		} else {
			System.out.println(needPoint * pointRate); // 1ポイント=100円
		}

	}

}
