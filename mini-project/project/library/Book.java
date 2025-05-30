package project.library;

//Encapsulation with a simple 'Book' class
class Book {
	private String title;
	private String author;
	private int pageCount;

	public Book(String title, String author, int pageCount) {
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
