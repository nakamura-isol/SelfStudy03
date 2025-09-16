package javadrill.exercise020.question014;

import java.util.HashMap;
import java.util.Map;

/**
 * 与えられた整数型のキーと値からなるマップnumberMapの値の合計を計算する。
 */
public class Question014 {

	public static void main(String[] args) {
		Map<String, Integer> numberMap = new HashMap<>();
		numberMap.put("One", 1);
		numberMap.put("Two", 2);
		numberMap.put("Three", 3);
		numberMap.put("Four", 4);
		numberMap.put("Five", 5);

		int sum = calculateSum(numberMap);

		System.out.println(sum);

	}

	/**
	 * マップの値の合計を計算するメソッド
	 * @param map
	 * @return
	 */
	private static int calculateSum(Map<String, Integer> map) {
		int sum = 0;
		// マップの各エントリに対して反復処理
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			// キーと値を取得
			String key = entry.getKey();
			int value = entry.getValue();
			sum += value;

		}

		return sum;

	}
}
