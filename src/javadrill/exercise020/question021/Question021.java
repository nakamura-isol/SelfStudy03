package javadrill.exercise020.question021;

import java.util.HashMap;
import java.util.Map;

/**
 * 文字列型のキーと整数型の値のstringIntMapの各キーと値を連結して新しい文字列を作成し、concatenatedMapを作る。
 */
public class Question021 {

	public static void main(String[] args) {
		Map<String, Integer> stringIntMap = new HashMap<>();
		stringIntMap.put("恵梨香", 30);
		stringIntMap.put("由梨恵", 34);
		stringIntMap.put("麻梨恵", 37);

		Map<String, String> concatenatedMap = concatenateMapKeysAndValues(stringIntMap);
		System.out.println(concatenatedMap);

	}

	/**
	 * 各キーと値を連結して新しい文字列を作成し、新しいマップに追加するメソッド
	 * @param originalMap
	 * @return
	 */
	private static Map<String, String> concatenateMapKeysAndValues(Map<String, Integer> originalMap) {
		// 新しいマップを作成
		Map<String, String> concatenatedMap = new HashMap<>();
		// オリジナルのマップのエントリに対して処理
		for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();

			// キーと値を連結して新しい文字列を作成
			String concatenatedString = key + value;

			// 新しいマップに連結した文字列を追加
			concatenatedMap.put(key, concatenatedString);

		}
		return concatenatedMap;

	}

}
