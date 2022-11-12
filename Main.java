
public class Main {
	
	public static String postfixToInfix(String exp) {
		
		Stack<String> s = new LinkedBasedStack<String>();
		
		exp = deleteSpaces(exp);
		int operandCounter = 0;
		for(int i = 0; i < exp.length(); i++) {
			
			if(i == 2) {
				if(operandCounter != 2) {// first two values of postfix must be a operand
					System.out.println("Wrong postfix!");
					return null;
				}
			}
			
			String character = "" + exp.charAt(i);
			switch(character) {
			case "+":
				String secondVal = s.pop();
				String firstVal = s.pop();
				String res = "(" + firstVal + "+" + secondVal + ")";
				s.push(res);
				break;
			case "-":
				secondVal = s.pop();
				firstVal = s.pop();
				res = "(" + firstVal + "-" + secondVal + ")";
				s.push(res);
				break;
			case "/":
				secondVal = s.pop();
				firstVal = s.pop();
				res = "(" + firstVal + "/" + secondVal + ")";
				s.push(res);
				break;
			case "*":
				secondVal = s.pop();
				firstVal = s.pop();
				res = "(" + firstVal + "*" + secondVal + ")";
				s.push(res);
				break;
			default:
				if(i == exp.length()) {// the last char of postfix exp must be a operator
					System.out.println("Wrong postfix!");
					return null;
				}
				s.push(character);
				operandCounter++;
			}
		}
		
		String res = s.pop();
		
		if(!s.isEmpty()) {
			System.out.println("Wrong postfix!");
			return null;
		}
		
		return res;
	}
	
	public static String deleteSpaces(String str) {
		
		String finalStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			}
			else {
				finalStr += str.charAt(i);
			}
		}
			
		return finalStr;
	}
	
	public static void main(String[] args) {
		
		String postfix = "A B C * +";
		String res = postfixToInfix(postfix);
		System.out.println(res);
		
	}

}
