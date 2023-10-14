package training.exception;

class InsufficientException extends Exception{
	String message;
	InsufficientException(String message){
		this.message = message;
	}
	@Override
	public String getMessage() {
		
		return message;
	}
}

public class Customized2 {
	
	
	public static void main(String[] args) {
		try {
			String msg="No Balance";
			throw new InsufficientException(msg);
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());
		}
	}
}


