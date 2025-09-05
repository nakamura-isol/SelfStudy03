package javadrill.exercise018.question021;

/**
 * 単一要素を保持するジェネリクスクラス
 */
public class Box<T> {
	private T value;
	
	Box(){
		
	}

	Box(T value) {
		this.value = value;

	}

	void addItem(T item) {

	}

	void set(T value) {
		this.value = value;
	}

	T get() {
		return value;
	}

}
