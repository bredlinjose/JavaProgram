package string.program;

public class OccuranceOfCharWithOutCollection {

	public static void main(String[] args) {
		occOfCharWithOutCollection("fyvdhsvhvhvvdhvvdg");
	}
	public static void occOfCharWithOutCollection(String input) {
		 int length = input.length();

	        for (int i = 0; i < length; i++) {
	            char currentChar = input.charAt(i);
	            int count = 0;

	            // Check the occurrence of the current character
	            for (int j = 0; j < length; j++) {
	            	if(currentChar==' ') {
	            		break;
	            	}
	                if (input.charAt(j) == currentChar) {
	                    count++;
	                }
	            }
	            if(currentChar==' ') {
            		
            	}else {
    	            // Print character occurrence
    	            System.out.println("Character '" + currentChar + "' occurs " + count + " times");

				}
	            // Skip counting for the same character in the future iterations
	            input = input.replace(currentChar, ' ');
	        }
	    }
}
