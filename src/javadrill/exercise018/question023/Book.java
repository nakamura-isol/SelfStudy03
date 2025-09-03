package javadrill.exercise018.question023;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private int year;

	Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		// 引数のオブジェクトがthis.オブジェクト（Book）と同じインスタンスか
		if (this == obj) {
			return true;
		}
		// 引数のオブジェクトがnullでない、同じクラスのインスタンスか確認
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		// 以下のインスタンス変数ごとの比較をするために、
		// 引数のオブジェクトをBookクラスにキャストする必要がある。
		Book otherBook = (Book) obj;
		// インスタンス変数ごとにその値が等しいか比較する
		return Objects.equals(title, otherBook.title) &&
				Objects.equals(author, otherBook.author) &&
				year == otherBook.year;

	}

	@Override
	public int hashCode() {
		// title と author のハッシュコードを組み合わせて返す
		return Objects.hash(title, author);
	}

}
