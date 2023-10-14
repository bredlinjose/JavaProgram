package training.stringclass;

public class StringClass {
	
	public static void main(String[] args) {
		// String is final class modification not possible
		String name="Hello"; // data store in constant pool (duplicates not allowed)
		String a="Hello"; // duplicate so the name address is pointing to a
		System.out.println(name.hashCode()); // based on characters in String
		System.out.println(name.equals(a)); // compare char in the string
		
		System.out.println(name == a); // compare object address
		
		String s = new String("hi");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		String s1 = new String("hi");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
		
		a= a.concat("bye"); //(String modification is not possible) new object is created
		System.out.println(a);
		System.out.println(name==a);  //false
		
		
	}

}
