package javadrill.exercise018.question015;

public class Main {

	public static void main(String[] args) {
		// 整数型のBoxインスタンス作成		
		Box<Integer>integerBox = new Box<>();
		integerBox.setElement(30);
		System.out.println(integerBox.getElement());
		
		 // 文字列型のBoxインスタンス作成
		Box<String>stringBox = new Box<>();
		stringBox.setElement("恵梨香");
		System.out.println(stringBox.getElement());
		
		// ダブル型のBoxインスタンス作成
		Box<Double>doubleBox = new Box<>();
		doubleBox.setElement(164.0);
		System.out.println(doubleBox.getElement());

	}

}
