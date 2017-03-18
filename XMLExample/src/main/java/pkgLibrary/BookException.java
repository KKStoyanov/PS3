package pkgLibrary;

import java.util.ArrayList;

public class BookException extends Exception{

	
	public BookException(String ID){
		System.out.println(ID + " is not in the catalog.");
	}

}
