package javadrill.exercise020.question022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 文字列型のキーと整数型の値からなるpriceMapから最大の値を持つエントリを見つける。
 */
public class Question022 {

	public static void main(String[] args) {
		// 与えられた文字列型のキーと整数型の値からなるマップ priceMap
		Map<String, Integer> priceMap = new HashMap<>();
		priceMap.put("Apple", 120);
		priceMap.put("Banana", 80);
		priceMap.put("Orange", 150);
		priceMap.put("Grapes", 200);

		Entry<String, Integer> maxEntry = null;
		for (Map.Entry<String, Integer> entry : priceMap.entrySet()) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}

		}
		System.out.println(maxEntry);
	}

}
