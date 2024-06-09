package project.library;

class Book1 {
	private String title;
	private String author;
	private int pageCount;

	public Book1(String title, String author, int pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}

	// Getters and Setters
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

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public void printBookDetails() {
		System.out.println("Book: " + title + ", Author: " + author + ", Pages: " + pageCount);
	}
}

//Inheritance with a 'Textbook' subclass that extends 'Book'
class Textbook1 extends Book1 {
	private String subject;

	public Textbook1(String title, String author, int pageCount, String subject) {
		super(title, author, pageCount);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// Overriding the printBookDetails method
	@Override
	public void printBookDetails() {
		super.printBookDetails();
		System.out.println("Subject: " + subject);
	}
}

//Polymorphism with a method that prints details of any book
public class All_In_One {
	public static void printDetails(Book1 book) {
		book.printBookDetails();
	}

	public static void main(String[] args) {
		Book1 novel = new Book1("1984", "George Orwell", 328);
		Textbook1 mathTextbook = new Textbook1("Calculus", "James Stewart", 1392, "Mathematics");
		EBook1 eBook = new EBook1("One Indian Girl", "Chetan Bhagat", 146, "pdf");
		
		printDetails(novel); // Polymorphism in action
		printDetails(mathTextbook); // Polymorphism in action
		printDetails(eBook);
	}
}

//Abstraction with an interface 'Readable' that 'Book' class can implement
interface Readable1 {
	void read();
}

class EBook1 extends Book1 implements Readable1 {
	private String fileType;

	public EBook1(String title, String author, int pageCount, String fileType) {
		super(title, author, pageCount);
		this.fileType = fileType;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	// Overriding the printBookDetails method
		@Override
		public void printBookDetails() {
			super.printBookDetails();
			read();
		}

	// Implementing the read method from Readable interface
	@Override
	public void read() {
		
		System.out.println("eBook format: " + fileType);
	}
}
