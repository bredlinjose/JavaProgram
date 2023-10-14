package training.oops.encapsulation;

class Credentials {
	private String email= "bredlinjose@gmail.com";
	private String password="Password@123";
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

public class Login {

	public static void main(String[] args) {
		Credentials l = new Credentials();
		System.out.println(l.getEmail());
		System.out.println(l.getPassword());
		l.setPassword("Password@456");
		System.out.println(l.getPassword());
		

	}

}
