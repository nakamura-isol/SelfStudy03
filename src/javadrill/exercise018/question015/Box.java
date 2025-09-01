package javadrill.exercise018.question015;
/**
 * 要素を1つだけ格納できるBoxというジェネリクスクラス
 * @param <T>
 */
public class Box<T> {
	private T element;

	Box() {
		this.element = null;
	}

	T getElement() {
		return element;
	}

	void setElement(T element) {
		this.element = element;
	}

}
