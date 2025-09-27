package paiza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C043_revise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		int countOfItemUse = Integer.parseInt(firstLine);
		String secondLine = sc.nextLine();
		String[] playerIdArray = secondLine.split(" ");

		Map<String, Integer> playerIdAndCountMap = new HashMap<>();

		int count = 1;
		for (int i = 0; i < playerIdArray.length; i++) {
			if (playerIdAndCountMap.containsKey(playerIdArray[i])) {
				continue;
			}
			for (int j = i + 1; j < playerIdArray.length; j++) {
				if (playerIdArray[i].equals(playerIdArray[j])) {
					count++;
				}
			}
			playerIdAndCountMap.put(playerIdArray[i], count);
			count = 1;

		}

		// 出力
		// 先に全部の値を見て最大値を取得する
		int max = 0;
		for (int mapValue : playerIdAndCountMap.values()) {
			max = Math.max(max, mapValue);
		}
		
		List<String> mapValueList = new ArrayList<>();
		// エントリから値の確認をして用意したリストにキーを入れる
		for (Map.Entry<String, Integer> entry : playerIdAndCountMap.entrySet()) {
			if (entry.getValue() == max)
				mapValueList.add(entry.getKey());
		}
		 // タイは昇順で出力
		Collections.sort(mapValueList);

		for (int i = 0; i < mapValueList.size(); i++) {
			if (i > 0) {
				System.out.print(mapValueList.get(i));
			}

		}

		

	}
}
