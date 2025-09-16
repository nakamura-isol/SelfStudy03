package javadrill.exercise020.question010;

import java.util.Set;
import java.util.TreeSet;

/**
 * 整数型setAとsetBを結合して新しいセットを作成し、要素を昇順で表示する
 */
public class Question010 {

	public static void main(String[] args) {
		Set<Integer> setA = Set.of( 1, 4, 5);
		Set<Integer> setB = Set.of(2, 6, 5, 3);

		// 新しいセットを作成して結合（昇順にソートされる）
		Set<Integer> combinedSet = new TreeSet<>(setA);
		combinedSet.addAll(setB);

		// 結果を昇順で表示
		System.out.println("結合されたセット（昇順）: " + combinedSet);
	}

}
