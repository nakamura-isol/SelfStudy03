package javadrill.exercise020.question005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * 与えられたリストのイテレーターを使用して、各要素を"Updated"に変更してリストを表示する
 */
public class Question005 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Kiwi"));
		ListIterator<String> iterator = fruits.listIterator();
		while (iterator.hasNext()) {
			// イテレーターを進めて現在の要素にアクセス
			iterator.next();
			// 現在の要素を削除
			iterator.remove();
			// "Updated"という要素を追加
			iterator.add("Updated");
		}
		// 変更後のリストを表示
		System.out.println(fruits);

	}

}
