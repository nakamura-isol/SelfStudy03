package javadrill.exercise018.question020;

import java.util.List;

/**
 * 数値型のリストまたはそのサブタイプを受け取り、要素を順番に表示するprintNumbersメソッドを持つ。
 */
public class Question020 {

	public static void main(String[] args) {
		// 整数型のリストを作成して表示
		List<Integer> integerList = List.of(1, 2, 3, 4, 5);
		printNumbers(integerList);

		// ダブル型
		List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		printNumbers(doubleList);

		// Float型
		List<Float> floatList = List.of(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
		printNumbers(floatList);
	}

	/**
	 * ジェネリクスメソッド
	 * 数値型のリストまたはそのサブタイプを受け取り、要素を順番に表示する。
	 * 整数型のリスト、ダブル型のリスト、および任意の数値型のサブタイプのリストの要素をそれぞれ表示する。
	 * @param list
	 */
	private static <T extends Number> void printNumbers(List<T> numbers) {
		for (T number : numbers) {
			System.out.println(number);
		}

	}

}
