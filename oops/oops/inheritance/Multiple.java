package oops.inheritance;

interface Backend {
	void connectServer();
}

interface Frontend {
	void responsive(String str);
}

class Language implements Frontend, Backend {

	String language = "Java";

	@Override
	public void connectServer() {
		System.out.println(language + " can be used as backend language.");
	}

	@Override
	public void responsive(String str) {
		System.out.println(str + " can also be used as frontend.");
	}
}

public class Multiple {

	public static void main(String[] args) {
		Language language = new Language();
		language.connectServer();
		language.responsive("Java");
	}
}