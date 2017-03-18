package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;

	@XmlElement(name = "book")
	ArrayList<Book> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public Book getBook(String input_id) throws BookException {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == input_id) {
				return books.get(i);
			}
		}
		throw new BookException(input_id);

	}

	public void addBook(Book book) throws BookException2 {
		for (Book b : this.getBooks()) {
			if (book.getId() == b.getId()) {
				throw new BookException2(book);
			}
		}
		books.add(book);
		this.setBooks(books);

	}

}
