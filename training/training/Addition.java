package training;

public class Addition {
	int a;
	int b;
	Addition(){
		System.out.println("Zero Argument Constructor");
		
	}
	Addition(int a){
		this();
		this.a = a;
		System.out.println(a);

	}
	Addition(int a, int b){
		this(a);
		this.a = a;
		this.b = b;
		System.out.println(a+b);

	}
	
	public static void main(String[] args) {
		Addition a = new Addition(10, 20);
		System.out.println("========");
		System.out.println(a.a);
		System.out.println(a.b);



	}

}
