package javadrill.exercise018.question019;

import java.util.List;

public class Question019 {

	public static void main(String[] args) {
		// 整数型のリスト
		List<Integer> intList = List.of(1, 2, 3, 4, 5);
		// 文字列型のリスト
		List<String> stringList = List.of("apple", "banana", "cherry", "date");
		// 任意の型のリスト
		List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

		// 各リストの要素を表示
		System.out.println("Original Integer List: " + intList);
		System.out.println("Original String List: " + stringList);
		System.out.println("Original Double List: " + doubleList);

		// 各リストで swapElements メソッドを使用して要素を交換
		swapElements(intList, 1, 3);
		swapElements(stringList, 0, 2);
		swapElements(doubleList, 2, 4);

		// 交換後のリストの要素を表示
		System.out.println("After Swapping Integer List: " + intList);
		System.out.println("After Swapping String List: " + stringList);
		System.out.println("After Swapping Double List: " + doubleList);
	}

	/**
	 * 与えられたリスト内の指定された2つの要素を交換する
	 * @param <T>
	 * @param list
	 * @param index1
	 * @param index2
	 */
	private static <T> void swapElements(List<T> list, int index1, int index2) {

		// index1もindex2も0以下で、サイズ以上であれば終了
		if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
			return;
		}
		// インデックス1と2の要素を交換
		// リストのインデックス1を取得
		T temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}
}
