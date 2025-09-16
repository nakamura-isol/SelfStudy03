package javadrill.exercise020.question018;

import java.util.HashMap;
import java.util.Map;

/**
 * 文字列型のキーと整数型の値からなるマップoriginalMapのキーと値を反転させた新しいマップreversedMapを作成する。
 */
public class Question018 {

	public static void main(String[] args) {
		Map<String, Integer> originalMap = new HashMap<>();
		originalMap.put("1月", 1);
		originalMap.put("2月", 2);
		originalMap.put("3月", 3);

		Map<Integer, String> reverseMap = createReverseMap(originalMap);
		System.out.println(reverseMap);

	}

	/**
	 * 
	 * @param <K>
	 * @param <V>
	 * @param map
	 * @return
	 */
	private static <K, V> Map<V, K> createReverseMap(Map<K, V> map) {
		// 新しいマップを作成
		Map<V, K> reversedMap = new HashMap<>();

		for (Map.Entry<K, V> entry : map.entrySet()) {
			K key = entry.getKey();
			V value = entry.getValue();
			reversedMap.put(value, key);

		}

		return reversedMap;

	}

}
