package ch24_Collection;

import java.util.ArrayList;

class Book{
	int id;
	String title;
	String author;
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
}

public class ch24_6 {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		Book b1 = new Book(001, "Economics", "Pole");
		Book b2 = new Book(002, "MicroEconomics", "Josh");
		Book b3 = new Book(003, "MacroEconomics", "Mathew");
		books.add(b1);
		books.add(b2);
		books.add(b3);
		for(Book b: books) {
			System.out.println("Bookname: " + b.title + ", BookId: " + b.id + ", Author: " + b.author);
		}
		

	}

}
