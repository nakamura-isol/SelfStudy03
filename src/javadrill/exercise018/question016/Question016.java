package javadrill.exercise018.question016;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * ワイルドカードを使用したメソッドを呼び出して、異なる型のコレクションを出力する
 */
public class Question016 {

	public static void main(String[] args) {
		// 整数型のリスト
		List<Integer>integerList =new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);

		// 文字列型のリスト
		List<String>stringList = new ArrayList<>();
		stringList.add("One");
		stringList.add("Two");
		stringList.add("Three");
		
		// 任意の型のリスト
		Set<Double>doubleSet = new HashSet<>();
		doubleSet.add(1.1);
		doubleSet.add(2.2);
		doubleSet.add(3.3);

		printElements(integerList);
		printElements(stringList);
		printElements(doubleSet);

	}
	/**
	 * ワイルドカードを使用したジェネリクスメソッド
	 * @param collection
	 */
	private static void printElements(Collection<?>collection) {
		for(Object element:collection) {
			System.out.println(element);
		}
	}
	

}
