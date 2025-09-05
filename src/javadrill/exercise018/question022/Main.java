package javadrill.exercise018.question022;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 文字列型のリスト
		List<String> stringList = Arrays.asList("Apple", "Banana", "Orange");
		// 整数型のリスト
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		// 任意の型のリストも表示可能
		List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

		ElementPrinter elementPrinter = new ElementPrinter();
		elementPrinter.printElements(stringList);
		elementPrinter.printElements(integerList);
		elementPrinter.printElements(doubleList);

	}

}
