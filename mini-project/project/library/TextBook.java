package project.library;

//Inheritance with a 'Textbook' subclass that extends 'Book'
class TextBook extends Book {
	private String subject;

	public TextBook(String title, String author, int pageCount, String subject) {
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
