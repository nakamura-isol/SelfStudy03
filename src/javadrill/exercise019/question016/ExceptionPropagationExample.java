package javadrill.exercise019.question016;

public class ExceptionPropagationExample {

	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("メインメソッド: " + e.getMessage());
		}
	}

	static void methodA() throws Exception {
		methodB();
	}

	static void methodB() throws Exception {
		methodC();
	}

	static void methodC() throws Exception {
		throw new ArithmeticException("methodC で例外が発生しました");
	}

}
