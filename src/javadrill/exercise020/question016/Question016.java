package javadrill.exercise020.question016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 与えられた整数型のキーと値からなるマップageMap内で特定の値を持つエントリを削除する。
 */
public class Question016 {

	public static void main(String[] args) {
		Map<String, Integer> ageMap = new HashMap<>();
		ageMap.put("恵梨香", 30);
		ageMap.put("由梨恵", 34);
		ageMap.put("麻梨恵", 37);
		ageMap.put("優理", 30);
		ageMap.put("直也", 30);

		removeEntriesByValue(ageMap,30);
	}

	/**
	 * 特定の値を持つエントリを削除するメソッド
	 */
	private static void removeEntriesByValue(Map<String, Integer> map, int valueToRemove) {
		// イテレータを使用してエントリを反復処理
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			 // 特定の値を持つエントリを削除
			if(entry.getValue()==valueToRemove) {
				 // イテレータを使用してエントリを削除
				iterator.remove();
				System.out.println("削除されたエントリ："+entry.getKey()+"\t"+entry.getValue());
			}
		}
	}
}
