package javadrill.exercise018.question025;

import java.util.Objects;

/**
 * // Comparableインターフェースを実装して、比較メソッドcompareToを提供する
 */
public class Student implements Comparable<Student> {
	private int id;
	private String name;
	// GradePointAverage（平均成績点）
	private double gpa;

	// コンストラクタ
	Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	// compareToメソッドをオーバーライドして、Student オブジェクトの比較を実装する
	@Override
	public int compareTo(Student other) {
		// idで比較する例。他の属性で比較する場合はその属性を利用する
		return Integer.compare(this.id, other.id);
	}

	// equalsメソッドをオーバーライドして、オブジェクトの内容の一致を確認する
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || this.getClass() != object.getClass()) {
			return false;
		}
		Student student = (Student) object;

		return this.id == student.getId() && Objects.equals(this.name, student.name)
				&& Double.compare(this.gpa, student.gpa) == 0;
	}

	// hashCodeメソッドをオーバーライドして、ハッシュコードの生成を提供する
	@Override
	public int hashCode() {
		return Objects.hash(id, name, gpa);

	}

	// toStringメソッドをオーバーライドして、オブジェクトの文字列表現を提供する
	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gpa=" + gpa +
				'}';
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	double getRollNumber() {
		return gpa;
	}

}
