package javadrill.exercise019.question017;

public class RethrowExample {

	public static void main(String[] args) {
		try {
			performOperation();
		} catch (CustomException e) {
			System.out.println("メインメソッド: " + e.getMessage());
		}
	}

	static void performOperation() throws CustomException {
		try {
			// 何らかの操作を試みる
			// 例外のテスト
			// ゼロ除算でArithmeticExceptionが発生
			int x = 10 / 0;
		} catch (Exception e) {
			String errorMessage = "performOperation メソッド内でエラーが発生しました";
			// CustomExceptionオブジェクトの作成
			CustomException customException = new CustomException(errorMessage, e);
			// 新しく生成したCustomExceptionを再スロー
			throw customException;
		}
	}
}

class CustomException extends Exception {
	// コンストラクタにエラーメッセージと元の例外を渡す
	CustomException(String message, Throwable cause) {
		super(message, cause);

	}
}