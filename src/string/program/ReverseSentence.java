package string.program;

public class ReverseSentence {
	public static void main(String[] args) {
		reverse1();
		System.out.println();
		reverse2();
		System.out.println();
		reverse3();
		System.out.println();
		reverse4();
		System.out.println();
		reverse5();
		System.out.println();
		reverse6();
	}
	
	public static void reverse1() {
		String s = "My name is Bredlin Jose";
		// jose bredlin is name my
		String str = s.toLowerCase();
		String [] arr = str.split(" ");
		for (int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void reverse2() {
		String s = "My name is Bredlin Jose";
		// ym eman si nilderb esoj
		String str = s.toLowerCase();
		String [] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String ab = arr[i];
			for (int j = ab.length()-1; j >=0 ; j--) {
				System.out.print(ab.charAt(j));
			}
			System.out.print(" ");
		}
	}
	public static void reverse3() {
		String s = "My name is Bredlin Jose";
		// esoj nilderb si eman ym
		String str = s.toLowerCase();
		StringBuilder builder = new StringBuilder();
		builder.append(str);
		System.out.print(builder.reverse());
		
	}
	
	public static void reverse4() {
		String s = "My name is Bredlin Jose";
		// esoj nilderb si eman ym
		String str = s.toLowerCase();
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void reverse5() {
		String s = "My name is Bredlin Jose";
		// esoj nilderb si eman ym
		String str = s.toLowerCase();
		String rev="";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch=str.charAt(i);
			rev= ch+rev;
		}
		System.out.print(rev);
	}
	
	public static void reverse6() {
		String s = "My name is Bredlin Jose";
		// esoj nilderb si eman ym
		String str = s.toLowerCase();
		String rev="";
		char ch;
		for (int i = str.length()-1; i >=0; i--) {
			ch=str.charAt(i);
			rev= rev+ch;
		}
		System.out.print(rev);
	}
}
