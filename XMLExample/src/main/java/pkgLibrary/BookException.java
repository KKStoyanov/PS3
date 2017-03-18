package pkgLibrary;

import java.util.ArrayList;

public class BookException extends Exception{
	private Book book;
	
	public BookException(String ID){
		this.book = book;
		System.out.println(ID + " is not in the catalog.");
	}

}
