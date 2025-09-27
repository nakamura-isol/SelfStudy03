package paiza;

import java.util.Scanner;

public class C086_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String removeChar = "aeiouAEIOU";
		StringBuilder sb = new StringBuilder();

		for (char lineChar : line.toCharArray()) {
			// removeCharからlineCharのインデックスを探す
			int indexOfRemoveChar = removeChar.indexOf(lineChar);
			if (indexOfRemoveChar == -1) {
				sb.append(lineChar);
			}
//
//			if (removeChar.indexOf(lineChar) == -1)
//				sb.append(lineChar);
		}

		System.out.println(sb.toString());

	}
}
