package training;
// this and super keyword can use only in the non static area/context
// super --> to access parent class member from sub class

class Father{
	String name="Smith";
	
}

class Son extends Father{
	String name="Allen";
	void sonData() {
		System.out.println("Son Name: "+this.name); 
		System.out.println("Father Name: "+super.name);
	}
}

public class This$Super_Keyword {

	public static void main(String[] args) {
		Son s= new Son();
		s.sonData();

	}
}
