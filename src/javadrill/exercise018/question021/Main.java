package javadrill.exercise018.question021;

public class Main {

	public static void main(String[] args) {
		// Integer型のリミテッドボックスを作成（要素追加回数の上限を3とする）
		LimitedBox<Integer> integerLimitedBox = new LimitedBox<>(3);

		integerLimitedBox.addItem(1);
		integerLimitedBox.addItem(2);
		integerLimitedBox.addItem(3);
		// 4回目の追加はエラーメッセージが表示される
		integerLimitedBox.addItem(4);

		LimitedBox<String> stringLimitedBox = new LimitedBox<>(3);
		stringLimitedBox.addItem("恵梨香");
		stringLimitedBox.addItem("由梨恵");
		stringLimitedBox.addItem("麻梨恵");
		stringLimitedBox.addItem("真澄");
	}

}
