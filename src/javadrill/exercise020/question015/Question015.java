package javadrill.exercise020.question015;

import java.util.HashMap;
import java.util.Map;

/**
 * 文字列型のキーと値からなるstringMapに、エントリ追加時にキーの重複と、値の重複を検出するメソッドを作る。
 * 
 */
public class Question015 {

	public static void main(String[] args) {

		Map<String, String> duplicateKeyMap = new HashMap<>();

		findDuplicateKey(duplicateKeyMap, "1番", "1");
		findDuplicateKey(duplicateKeyMap, "2番", "2");
		findDuplicateKey(duplicateKeyMap, "3番", "3");
		findDuplicateKey(duplicateKeyMap, "1番", "4");

		Map<String, String> duplicateValueMap = new HashMap<>();
		duplicateValueMap.put("1番", "1");
		duplicateValueMap.put("2番", "2");
		duplicateValueMap.put("3番", "3");
		duplicateValueMap.put("4番", "1");

		findDuplicateValue(duplicateValueMap);

	}

	/**
	 * 追加時に重複を検出するメソッド
	 * @param duplicateKeyMap
	 */
	private static void findDuplicateKey(Map<String, String> duplicateKeyMap, String key, String value) {
		String newValue = duplicateKeyMap.put(key, value);
		if (newValue != null) {
			System.out.println("重複キー：" + key);
			System.out.println("既に入ってた値：" + newValue + ",今入れようとした値：" + value);
		}

	}

	/**
	 * 値の重複を検出するメソッド
	 * @param stringMap
	 */
	private static void findDuplicateValue(Map<String, String> map) {
		Map<String, Boolean> valueSet = new HashMap<>();
		// valueSet: これまでに出現した値の記録（key=値, value=true）
		// 既に記録がある → 同じ値が二度目以降 = 重複
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String value = entry.getValue();
			//
			if (valueSet.containsKey(value)) {		
				System.out.println("重複値: " + value);
			} else {		
				valueSet.put(value, true);
			}
		}

	}
}
