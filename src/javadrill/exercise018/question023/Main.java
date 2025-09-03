package javadrill.exercise018.question023;

public class Main {

	public static void main(String[] args) {
		  // Book インスタンスの生成
        Book book1 = new Book("Java Programming", "John Doe", 1995);
        Book book2 = new Book("Java Programming", "John Doe",1995);

        // equals メソッドの使用例
        System.out.println("Are books equal? " + book1.equals(book2));

        // hashCode メソッドの使用例
        System.out.println("Hash code for book1: " + book1.hashCode());
        System.out.println("Hash code for book2: " + book2.hashCode());

	}

}
