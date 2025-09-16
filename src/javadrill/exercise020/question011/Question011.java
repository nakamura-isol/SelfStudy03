package javadrill.exercise020.question011;

import java.util.HashSet;
import java.util.Set;
/**
 * setXに含まれていてsetYには含まれていない要素からなる新しいセットを作成する。
 */
public class Question011 {

	public static void main(String[] args) {
		// 与えられた文字列型セット setX と setY
		Set<String> setX = Set.of("Apple", "Banana", "Orange", "Grapes");
		Set<String> setY = Set.of("Banana", "Grapes", "Kiwi");
		
		// 新しいセットを作成
		Set<String> resultSet = new HashSet<>();
		
		// setX の要素を検証して新しいセットに追加
		for(String element:setX) {
			if(!setY.contains(element)) {
				resultSet.add(element);
			}
		}
		System.out.println(resultSet);
	}

}
