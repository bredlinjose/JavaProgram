package training.oops.inheritance;

public class Inheritance_MultiLevel {

	public static void main(String[] args) {
		FacebookV1 v1 = new FacebookV1();
		v1.addFriend();
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		
		FacebookV2 v2 = new FacebookV2();
		v2.addFriend();
		v2.post();
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");

		FacebookV3 v3 = new FacebookV3();
		v3.addFriend();
		v3.post();
		v3.status();
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");

	}

}
class FacebookV1{
	public void addFriend() {
		System.out.println("Added successfully");
	}
}

class FacebookV2 extends FacebookV1{
	public void post() {
		System.out.println("Posted successfully");
	}
}

class FacebookV3 extends FacebookV2{
	public void status() {
		System.out.println("Updated successfully");
	}
}