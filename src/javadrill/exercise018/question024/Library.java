package javadrill.exercise018.question024;

import java.util.HashSet;
import java.util.Set;

public class Library {
	  private Set<CustomObject> books;

	     Library() {
	        this.books = new HashSet<>();
	    }

	     void addBook(CustomObject book) {
	        books.add(book);
	    }

	     boolean containsBook(CustomObject book) {
	        return books.contains(book);
	    }

}
