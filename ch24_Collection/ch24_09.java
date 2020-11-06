package ch24_Collection;

import java.util.LinkedList;

//class Book{
//	int id;
//	String bookTitle;
//	String author;
//	public Book(int id, String bookTitle, String author) {
//		this.id = id;
//		this.bookTitle = bookTitle;
//		this.author = author;
//	}
//	
//}
public class ch24_09 {

	public static void main(String[] args) {
		LinkedList<Book> list = new LinkedList<Book>();
		Book b1 = new Book(1001, "Java王者歸來", "洪錦魁");
		Book b2 = new Book(1002, "Python王者歸來", "洪錦魁");
		Book b3 = new Book(1003, "HTML5+CSS5王者歸來", "洪錦魁");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book obj:list)
			System.out.println(obj.id + " " + obj.title + " " + obj.author);

	}

}
