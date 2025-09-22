package paiza;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C156 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int countOfWorkingDay = sc.nextInt();

		sc.nextLine();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

		long amountOfWorkingTime = 0;

		for (int i = 0; i < countOfWorkingDay; i++) {

			String workingTime = sc.nextLine();
			String[] workingTimeArray = workingTime.split(" ");

			String stringStartTime = workingTimeArray[0];
			String stringFinishTime = workingTimeArray[1];

			LocalTime startTime = LocalTime.parse(stringStartTime, dtf);
			LocalTime finishTime = LocalTime.parse(stringFinishTime, dtf);

			amountOfWorkingTime += java.time.Duration.between(startTime, finishTime).toMinutes();
		}

		// 時 = 合計分 ÷ 60（整数割り算で「60分が何回入るか」）
		// 合計分 % 60（60 で割った余り）
		long hours = amountOfWorkingTime / 60;
		long mins = amountOfWorkingTime % 60;
		System.out.println(hours + "\t" + mins);

	}

}
