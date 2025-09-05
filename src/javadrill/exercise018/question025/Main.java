package javadrill.exercise018.question025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(3, "Alice", 3.8));
		students.add(new Student(1, "Bob", 2.9));
		students.add(new Student(2, "Charlie", 3.2));
		// id順に並ぶ
		Collections.sort(students); 
		System.out.println(students);
	}

}
