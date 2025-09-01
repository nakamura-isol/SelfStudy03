package javadrill.exercise018.question017;

public class Main {

	public static void main(String[] args) {
		// 整数型のペア
		Pair<Integer> intPair = new Pair<>(3, 7);
		System.out.println("Max of Integers: " + intPair.getMax());

		// ダブル型のペア
		Pair<Double> doublePair = new Pair<>(5.6, 2.3);
		System.out.println("Max of Doubles: " + doublePair.getMax());

		// 文字列型のペア
		Pair<String> stringPair = new Pair<>("apple", "orange");
		System.out.println("Max of Strings: " + stringPair.getMax());

	}

}
