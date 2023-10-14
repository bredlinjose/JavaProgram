package training.stringclass;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		// modification done in same object
		StringBuffer b = new StringBuffer("Hello");
		System.out.println(b); // toString() is over ridden
		StringBuffer c=b;
		
		System.out.println(c==b);
		// in the same object modifications are done
		b= b.append("Hi");
		System.out.println(b); //HelloHi
		System.out.println(c); //HelloHi
		
		System.out.println(c==b);
	}

}
