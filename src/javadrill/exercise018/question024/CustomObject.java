package javadrill.exercise018.question024;

import java.util.Objects;

public class CustomObject {
	private int intValue;
	private String stringValue;

	CustomObject(int intValue, String stringValue) {
		this.intValue = intValue;
		this.stringValue = stringValue;

	}

	// オブジェクトの等価性の比較
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		CustomObject other = (CustomObject) obj;
		return intValue == other.intValue && stringValue == other.stringValue;
	}

	@Override
	public int hashCode() {
		// 異なる素数を使用してハッシュコードを計算
		// 初期値に17を（素数であることが望ましい）
		int result = 17;
		// // intValueが影響する部分のハッシュコードを加算
		result = 31 * result + intValue;
		// stringValueが影響する部分のハッシュコードを加算
		result = 31 * result + Objects.hashCode(stringValue);
		return 0;
	}
}
