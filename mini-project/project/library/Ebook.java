package project.library;

class EBook extends Book implements Readable {
	private String fileType;

	public EBook(String title, String author, int pageCount, String fileType) {
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
		System.out.println();
	}

	// Implementing the read method from Readable interface
	@Override
	public void read() {
		System.out.println("eBook format: " + fileType);
	}
}
