package libraryProject;

public class LibraryApp {

	public static void main(String[] args) {
		Library library = new Library();
		
		//defining our books
		Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book2 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99);
		Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99);
		Book book4 = new Book("No Country for Old Men", "Cormac McCarthy", "978-0375706677", 15.00);
		
		//adding all 3 books to the library
		System.out.println("Adding books...");
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		System.out.println("Books added.");
		
		//searches for a book by ISBN number
		System.out.println("\nSearching by ISBN number...");
		library.searchByISBN("978-0201633610");
		
		//Removes a book that is in the library and one that is not.
		System.out.println("\nAttempting to remove books...");
		library.removeBook(book3);
		library.removeBook(book4);

		//Displays all books in library.
		library.displayBooks();
		
	}

}
