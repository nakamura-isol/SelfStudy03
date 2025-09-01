package javadrill.exercise018.question017;
/**
 * 2つの要素を保持するクラス
 * @param <T>
 */
public class Pair<T extends Comparable<T>> {
	private T first;
	private T second;

	Pair(T first, T second) {
		this.first = first;
		this.second = second;

	}
	/**
	 * 2つの要素のうちで大きい方を返す
	 * @return
	 */
	T getMax() {
		return (first.compareTo(second) > 0) ? first : second;
	}

	T getFirst() {
		return first;
	}

	void setFirst(T first) {
		this.first = first;
	}

	T getSecond() {
		return second;
	}

	void setSecond(T second) {
		this.second = second;
	}

}
