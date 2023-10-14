package training.exception;

class NegativeInputException extends Exception{
	NegativeInputException(String msg){
		super(msg);
	}
}

public class Customized {
	
	public static void add(int a, int b) throws NegativeInputException {
		if(a>0 && b>0) {
			int res = a+b;
			System.out.println(res);
		}else {
			throw new NegativeInputException("Pass positive value");
		}
		
	}
	public static void main(String[] args) {
		try {
			add(-10,20);
		} catch (NegativeInputException e) {
			e.printStackTrace();
		}
	}
}


