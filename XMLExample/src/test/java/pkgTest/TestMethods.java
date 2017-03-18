package pkgTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import pkgLibrary.Book;
import pkgLibrary.BookException;
import pkgLibrary.BookException2;
import pkgLibrary.Catalog;
import pkgMain.XMLReader;

public class TestMethods {

	Date x = new Date();
	

	@Test
	public void TestAddBook() throws BookException2  {
		Book b = new Book("BK201", "Lebron James", "The Journey", "Sports", 9.99, x, "The journey Lebron took to get to where he is today");
		Book c = new Book("BK202", "Jules Verne", "10000 Leagues Under the Sea", "Adventure", 9.99, x, "Something");
		Catalog cat = new Catalog();
		ArrayList<Book> books = new ArrayList();
		cat.setBooks(books);
		
		cat.addBook(c);

		
		assertEquals(1, cat.getBooks().size());
		
		}
	
	@Test(expected = BookException2.class)
	public void TestAddBook2() throws BookException2  {
		Book b = new Book("BK201", "Lebron James", "The Journey", "Sports", 9.99, x, "The journey Lebron took to get to where he is today");
		Book c = new Book("BK202", "Jules Verne", "10000 Leagues Under the Sea", "Adventure", 9.99, x, "Something");
		Catalog cat = new Catalog();
		ArrayList<Book> books = new ArrayList();
		cat.setBooks(books);
		
		cat.addBook(c);
		cat.addBook(c);
		
		}
	
	@Test
	public void TestGetBook() throws BookException, BookException2  {
		Book b = new Book("BK201", "Lebron James", "The Journey", "Sports", 9.99, x, "The journey Lebron took to get to where he is today");
		Book c = new Book("BK202", "Jules Verne", "10000 Leagues Under the Sea", "Adventure", 9.99, x, "Something");
		Catalog cat = new Catalog();
		ArrayList<Book> books = new ArrayList();
		cat.setBooks(books);
		
		cat.addBook(c);
		cat.getBook("BK202");

		
		assertEquals(cat.getBook("BK202"), c);
		
		}
	
	@Test(expected = BookException.class)
	public void TestGetBook2() throws BookException, BookException2  {
		Book b = new Book("BK201", "Lebron James", "The Journey", "Sports", 9.99, x, "The journey Lebron took to get to where he is today");
		Book c = new Book("BK202", "Jules Verne", "10000 Leagues Under the Sea", "Adventure", 9.99, x, "Something");
		Catalog cat = new Catalog();
		ArrayList<Book> books = new ArrayList();
		cat.setBooks(books);
		
		cat.addBook(c);
		cat.getBook("BK201");
		
		}
}
