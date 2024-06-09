package project.library;

//Polymorphism with a method that prints details of any book
public class Library {
	public static void printDetails(Book book) {
		book.printBookDetails();
	}

	public static void main(String[] args) {
		Book novel = new Book("1984", "George Orwell", 328);
		TextBook mathTextbook = new TextBook("Calculus", "James Stewart", 1392, "Mathematics");
		EBook eBook = new EBook("One Indian Girl", "Chetan Bhagat", 146, "pdf");
		
		printDetails(novel); // Polymorphism in action
		printDetails(mathTextbook); // Polymorphism in action
		printDetails(eBook);
	}
}




