package string.program;

public class SeperateCharacters {
	
	private static void seperate1(String str) {
		String alpha="";
		String num="";
		String spec="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z') {
				alpha=alpha+str.charAt(i);
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				num=num+str.charAt(i);
			}else {
				spec=spec+str.charAt(i);
			}	
		}
		System.out.println("Letter "+alpha);
	    System.out.println("Digit "+num);
	    System.out.println("Special "+spec);
	}
	
	private static void seperate2(String str) {
		StringBuilder ch = new StringBuilder();
	    StringBuilder spec = new StringBuilder();
	    StringBuilder num = new StringBuilder();
		
	    for (char cha : str.toCharArray()) {
			if (Character.isLetter(cha)) {
				ch.append(cha);
			} else if (Character.isDigit(cha)) {
				num.append(cha);
			} else {
				spec.append(cha);
			}
		}
	    System.out.println("Letter "+ch.toString());
	    System.out.println("Digit "+num.toString());
	    System.out.println("Special "+spec.toString());
	}

	public static void main(String[] args) {
		String str="t@#e/u16wu6+3E_R54"; 
		
		seperate1(str);
		
		seperate2(str);
		
	}

}
