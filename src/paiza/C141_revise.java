package paiza;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class C141_revise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int headCount = Integer.parseInt(sc.nextLine());

		Map<String, Integer> electionMap = new HashMap<>();
		String[] electionArray = new String[headCount];
		for (int i = 0; i < headCount; i++) {
			String name = sc.nextLine();
			electionArray[i] = name;
		}

		for (int i = 0; i < electionArray.length; i++) {
			String name = electionArray[i];
			// すでに数えてある名前ならスキップ（重複カウント防止）
			if (electionMap.containsKey(name)) {
				continue;
			}
			// 自分の1票ぶんを先に入れておく
			int voteCount = 1;
			for (int j = i + 1; j < electionArray.length; j++) {
				if (name.equals(electionArray[j])) {
					// 自分の1票を含めて出現回数を数える
					voteCount++;
				}
			}
			electionMap.put(name, voteCount);
		}

		Entry<String, Integer> maxEntry = null;
		for (Map.Entry<String, Integer> entry : electionMap.entrySet()) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}

		}

		System.out.println(maxEntry.getKey());

	}

}
