package javadrill.exercise019.question007;

public class CustomExceptionExample {

	public static void main(String[] args) {
		CustomExceptionExample examle = new CustomExceptionExample();
		try{
			// 有効な入力
			examle.validateInput("ValidInput");
			// 無効な範囲
			examle.validateInput("InvalidInput");
			// 有効な範囲
			examle.checkRange(5);
			// 無効な範囲
			examle.checkRange(15); 

		}catch(InvalidInputException e) {
			 System.out.println("InvalidInputException: " + e.getMessage());
		}catch(OutOfRangeException e) {
			System.out.println("OutOfRangeException: " + e.getMessage());
		}
		
	}

	/**
	 * 入力が特定の条件を満たさない場合にInvalidInputExceptionをスロー
	 * @param input
	 * @throws InvalidInputException
	 */
	private void validateInput(String input) throws InvalidInputException {
		if (!input.equals("ValidInput")) {
			throw new InvalidInputException("無効な入力です");
		}
	}

	/**
	 * 範囲外の値が渡された場合にOutOfRangeExceptionをスロー
	 * @throws OutOfRangeException
	 */
	private void checkRange(int value) throws OutOfRangeException {
		if (value < 0 || value > 10) {
			throw new OutOfRangeException("範囲外の値です。");
		}
	}

}
