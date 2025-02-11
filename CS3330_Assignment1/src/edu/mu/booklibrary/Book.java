package edu.mu.booklibrary;

public class Book {
	String title;
	String author;
	String ISBN;
	double price;
	
	//default constructor
	public Book() {
		super();
		this.title = "Unknown";
		this.author = "Unknown";
		ISBN = "Unknown";
		this.price = 0.0;
	}
	
	//parameterized constructors 
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	//copy constructors
	public Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.ISBN = other.ISBN;
		this.price = other.price;
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
