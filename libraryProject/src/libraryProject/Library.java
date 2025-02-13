package libraryProject;

public class Library {
	
	Book[] Library = new Book[5];
	int index = 0;
	
	
	
	public boolean addBook(Book book) {
		// adds a book to the array if there is space
		if (index >= 5) {
			System.out.println("There are already 5 books in the library.");
			return false;
		}
		else {
			Library[index] = book;
			index++;
		return true;
		}
	}
	
	public void removeBook(Book book) {
		//removes book from array
		if (index > 0) {
			//check insures that if the book that is requested to be removed does not exist, it lets the user know.
			int check = 0;
			for (int number = 0; number <5; number++){
				if (Library[number] == book){
					Library[number] = null;
					System.out.println("Book removed.");
					break;
				}
				else {
					check++;
					if (check == 5) {
						//letting the user know the book was not found.
						System.out.println("A book was not found in the Library.");
						break;
					}
					continue;
				}
			}
		}
		//if no books are in Library, this lets the user know.
		else {
			System.out.println("Library is empty.");
			
		}
		
	}
	

	public void searchByISBN(String ISBN) {
		//searches for a book by its ISBN number and prints it if it finds it.
		//check insures to let the user know if the ISBN was not found.
		int check = 0;
		for (int number = 0; number < 5; number++) {
			//a check to ensure the entry is not null
			if(Library[number] == null) {
				continue;
			}
			if (Library[number].ISBN == ISBN) {
				System.out.println(Library[number]);
			}
			else {
				check++;
				if (check == 5) {
					//letting the user know the book was not found.
					System.out.println("There was no book with this ISBN number in the library.");
					break;
				}
				continue;
			}
		}
	}
	public void displayBooks() {
		//displays all books and their information
		System.out.println("\nCurrent Library - ");
		for (int number = 0; number < 5; number++) {
			//Displays an unassigned book as 'empty' rather than print 3 'Unknown's.
			if (Library[number] == null) {
				System.out.println("Empty");
			}
			else {
				System.out.println(Library[number]);
			}
		}
		
	}
	
	
}
