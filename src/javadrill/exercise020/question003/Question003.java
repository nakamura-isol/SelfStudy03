package javadrill.exercise020.question003;

import java.util.Arrays;
import java.util.List;

/**
 * リストに"Orange"という要素がリスト内に存在するかどうかを判定し、存在する場合はその要素を"Peach"に変更してリストを表示する
 */
public class Question003 {

	public static void main(String[] args) {
		List<String> fruitList = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Kiwi", "Mango");

		if (fruitList.contains("Orange")) {
			fruitList.set(fruitList.indexOf("Orange"), "Peach");
		}

		System.out.println(fruitList);

	}

}
