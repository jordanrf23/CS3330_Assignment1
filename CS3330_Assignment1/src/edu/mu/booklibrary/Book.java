package edu.mu.booklibrary;

public class Book {
	String title;
	String author;
	String ISBN;
	double price;
	
	public Book(String title, String author, String iSBN, double price) {
		super();
		this.title = "Unknown";
		this.author = "Unknown";
		ISBN = "Unknown";
		this.price = 0.0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		//Returns a string representation of the book
		return ISBN;
	}
	public boolean equals(Book other) {
		//Returns true if two books have the same ISBN number
		return true;
	}
}
