package javadrill.exercise018.question022;

import java.util.List;

public class ElementPrinter {
	// ジェネリクスメソッドprintElementsの宣言
	<T>  void printElements(List<T> list) {
		// リストの要素を順番に表示
		for (T element : list) {
			System.out.println(element);
		}
	}

}
