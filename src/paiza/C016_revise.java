package paiza;

import java.util.Scanner;

public class C016_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringBuilder sb = new StringBuilder(line.length());
		
		for (char lineChar : line.toCharArray()) {
			switch (lineChar) {
			case 'A':
				lineChar = '4';
				break;
			case 'E':
				lineChar = '3';
				break;
			case 'G':
				lineChar = '6';
				break;
			case 'I':
				lineChar = '1';
				break;
			case 'O':
				lineChar = '0';
				break;
			case 'S':
				lineChar = '5';
				break;
			case 'Z':
				lineChar = '2';
				break;

			default:

				break;
			}
			sb.append(lineChar);
		}
		

		
			System.out.print(sb.toString());
		


	}

}
