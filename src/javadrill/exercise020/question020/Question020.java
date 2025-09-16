package javadrill.exercise020.question020;

import java.util.HashMap;
import java.util.Map;

/**
 * 与えられた整数型のキーと値からなるscoreMaの値の平均を計算する。
 */
public class Question020 {

	public static void main(String[] args) {
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("恵梨香", 77);
		scoreMap.put("由梨恵", 80);
		scoreMap.put("麻梨恵", 100);

		double averageScore = calculateAverageScore(scoreMap);
		System.out.println(averageScore);

		// int average = 0;
		// int sum = 0;
		// for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
		// String key = entry.getKey();
		// int value = entry.getValue();
		// sum += value;
		// }
		// average = sum / scoreMap.size();
		// System.out.println(average);
	}

	/**
	 * マップの値の平均を計算するメソッド
	 * @param map
	 * @return
	 */
	private static double calculateAverageScore(Map<String, Integer> map) {
		if (map.isEmpty()) {
			// マップが空の場合はゼロを返すか、エラー処理を行うなど適切な対応を行う
			return 0.0;
		}

		int totalScore = 0;
		// マップの各値を合計
		for (int score : map.values()) {
			totalScore += score;

		}

		return (double) totalScore / map.size();

	}

}
