package javadrill.exercise019.question026;
/**
 * 適切なエラーメッセージとエラーコードを持つ。
 * ファイルからデータを読み取る。読み取り中に特定の条件が満たされない場合、独自のCustomFileReadExceptionをスローする。
 */
public class CustomFileReadException extends Exception{
	
	private int errorCode;
	
	CustomFileReadException(String str,int errorCode){
		super(str);
		this.errorCode = errorCode;
	}

	int getErrorCode() {
		return errorCode;
	}
}
