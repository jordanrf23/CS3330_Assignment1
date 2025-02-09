package edu.mu.booklibrary;

public class Library {
	private String[] Book;
	private int count;
	
	public boolean addBook(Book book) {
		// adds a book to the array if there is space
		return true;
	}
	public boolean removeBook(Book book) {
		//removes book from array it one exists
		return true;
	}
	public Book searchByISBN(String ISBN) {
		return null;
		//search for a book by ISBN and returns the book object or null if not found
	}
	public void displayBooks() {
		//prints details of all the books by using toString()
	}
}
