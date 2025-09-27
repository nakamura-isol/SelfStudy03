package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C130_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lessonAmount = Integer.parseInt(sc.nextLine());

		String[][] lessonResult = new String[lessonAmount][2];
		for (int i = 0; i < lessonAmount; i++) {
			String[] lessonResultArray = sc.nextLine().split(" ");
			for (int j = 0; j < lessonResultArray.length; j++) {
				lessonResult[i][j] = lessonResultArray[j];
			}
		}

		// yyじゃない行をカウント
		int needAmount = 0;
		List<Integer> needLessonList = new ArrayList<>();
		for (int i = 0; i < lessonAmount; i++) {
			if (!(lessonResult[i][0].equals("y") && lessonResult[i][1].equals("y"))) {
				needAmount++;
				needLessonList.add(i + 1);
			}

		}
		System.out.println(needAmount);
		for (int needLesson : needLessonList) {
			System.out.println(needLesson);

		}

	}

}
