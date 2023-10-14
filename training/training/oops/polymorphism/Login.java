package training.oops.polymorphism;

public class Login {
	String email;
	long mobNum;
	String password;
	Login(String email, String password){
		this.email=email;
		this.password= password;
		System.out.println("Logged in using email");
	}
	
	Login(long mobNum, String password){
		this.mobNum= mobNum;
		this.password= password;
		System.out.println("Logged in using mobile number");
	}
	public static void main(String[] args) {
		Login login1= new Login(8526003286l, "Password@123");
		Login login2= new Login("bredlinjose@gmail.com", "Password@123");

	}

}
