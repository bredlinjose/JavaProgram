package training;

class A{
	
}

class B extends A{
	
}

class C extends A{
	
}

class D extends C{
	
}

public class InstanceOf {

	public static void main(String[] args) {
		Object o=new A();
		System.out.println(o instanceof Object);
		System.out.println(o instanceof B);
		Object o1=new D();
		System.out.println(o1 instanceof A);
		System.out.println(o1 instanceof B);
	}

}
