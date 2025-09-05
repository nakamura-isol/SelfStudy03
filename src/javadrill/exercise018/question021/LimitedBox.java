package javadrill.exercise018.question021;

/**
 * Boxクラス拡張版（指定された回数までしか要素を追加できない」という制限付き）
 * @param <T>
 */
public class LimitedBox<T> extends Box<T> {
	private final int maxAddCount;
	private int currentAddCount;

	LimitedBox(int maxAddCount) {
		this.maxAddCount = maxAddCount;
		this.currentAddCount = 0;

	}

	

	@Override
	void addItem(T item) {
		if (currentAddCount < maxAddCount) {
			super.addItem(item);
			currentAddCount++;
		} else {
			System.out.println("Cannot add more items. Limit reached.");
		}
	}
}
