package javadrill.exercise018.question018;

import java.util.List;

public class Question018 {

	public static void main(String[] args) {
		List<Integer> integerList = List.of(1, 2, 3, 4, 5);
		List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

		double sumOfIntegers = sumOfList(integerList);
		double sumOfDoubles = sumOfList(doubleList);

		System.out.println("Sum of integers: " + sumOfIntegers);
		System.out.println("Sum of doubles: " + sumOfDoubles);

	}

	/**
	 * 数値型のリストを受け取り、要素の合計を返す
	 * @param <T>
	 * @param list
	 * @return
	 */
	private static <T extends Number> double sumOfList(List<T> list) {
		double sum = 0.0;
		for (T element : list) {
			sum += element.doubleValue();
		}
		return sum;
	}

}
