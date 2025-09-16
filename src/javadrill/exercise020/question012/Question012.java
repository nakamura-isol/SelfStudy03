package javadrill.exercise020.question012;

import java.util.HashSet;
import java.util.Set;

/**
 * 与えられた文字列型セットsetPとsetQが等しいかどうかを判定する。
 */
public class Question012 {

	public static void main(String[] args) {
		// 与えられた文字列型セット setP と setQ
		Set<String> setP = new HashSet<>(Set.of("Apple", "Banana", "Orange"));
		Set<String> setQ = new HashSet<>(Set.of("Orange", "Banana", "Apple"));

		// 手順に従ってセットが等しいかどうかを判定
		boolean areSetsEqual = areEqualSets(setP, setQ);

		// 結果を表示
		if (areSetsEqual) {
			System.out.println("セット setP と setQ は等しいです。");
		} else {
			System.out.println("セット setP と setQ は等しくありません。");
		}

	}

	/**
	 * セットが等しいかどうかを判定するメソッド
	 * @param <T>
	 * @return
	 */
	private static <T> boolean areEqualSets(Set<T> set1, Set<T> set2) {
		// サイズの比較
		if (set1.size() != set2.size()) {
			return false;
		}
		// 要素の比較
		for (T element : set1) {
			if (!set2.contains(element)) {
				return false;
			}
		}
		return true;

	}

}
