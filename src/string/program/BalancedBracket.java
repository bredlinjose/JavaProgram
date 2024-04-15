package string.program;

import java.util.Stack;

public class BalancedBracket {

	static boolean isBalanced (String expr) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if(x== '{' || x== '(' || x== '[') {
				stack.push(x);
				continue;
			}

			if(stack.isEmpty())
				return false;

			switch (x) {
			case '}': 
				if(!stack.peek().equals('{'))
					return false;

				stack.pop();
				break;

			case ')': 
				if(!stack.peek().equals('('))
					return false;

				stack.pop();
				break;
				
			case ']': 
				if(!stack.peek().equals('['))
					return false;

				stack.pop();
				break;
				
			}
			
		}
		return (stack.isEmpty());
	}
		public static void main(String[] args) {
			String expr ="{[]{()}}";
			if(isBalanced(expr))
				System.out.println("Balanced Bracket");
			else
				System.out.println("Not a Balanced Bracket");
		}

	}
