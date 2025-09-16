package javadrill.exercise020.question017;

import java.util.HashMap;
import java.util.Map;

/**
 * 与えられた２つの整数型のキーと値からなるマップmapAとmapBがある。
 * mapAの各エントリに対して、mapBの対応するキーが存在する場合は値を合計して、存在しない場合はそのまま保持して新しいマップを作成する。
 */
public class Question017 {

	public static void main(String[] args) {
		Map<String, Integer> mapA = new HashMap<>();
		mapA.put("Apple", 3);
		mapA.put("Banana", 2);
		mapA.put("Orange", 5);

		Map<String, Integer> mapB = new HashMap<>();
		mapB.put("Apple", 7);
		mapB.put("Banana", 4);
		mapB.put("Grapes", 6);

		Map<String, Integer> mergedMap = maergeMaps(mapA, mapB);
		System.out.println(mergedMap);

	}

	/**
	 * 与えられた２つのマップをマージするメソッド
	 * @param mapB
	 * @return
	 */
	private static Map<String, Integer> maergeMaps(Map<String, Integer> mapA, Map<String, Integer> mapB) {

		// 新しいマップを作成
		Map<String, Integer> mergeMap = new HashMap<>(mapA);

		// mapBの各エントリに対して処理
		for (Map.Entry<String, Integer> entryB : mapB.entrySet()) {
			String keyB = entryB.getKey();
			int valueB = entryB.getValue();

			// mapAに対応するキーが存在する場合は値を合計
			if (mergeMap.containsKey(keyB)) {
				// その対応するキーに対応する値を取得
				int valueA = mergeMap.get(keyB);
				mergeMap.put(keyB, valueB + valueA);
			} else {
				mergeMap.put(keyB, valueB);
			}
		}

		return mergeMap;

	}

}
