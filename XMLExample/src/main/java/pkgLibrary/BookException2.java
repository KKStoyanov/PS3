package pkgLibrary;

public class BookException2 extends Exception {

	private Book book;

	public BookException2(Book book) {
		this.book = book;
		System.out.println(book.getId() + " is already in the catalog.");
	}

}
