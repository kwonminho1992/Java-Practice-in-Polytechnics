package r2;

import java.util.ArrayList;

public class Calculation {
	//constructor
	String n1 = "";
	String n2 = "";
	public Calculation(String n1, String n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	private static String digit = "10"; //digit set to calculate
	
	public boolean isRightFormOrNot () { // user can't input 0
		if (this.n1.equals("0") || this.n2.equals("0")) {
			return false;
		} else {
			return true;
		}
	}
	
	public String frontDigit () { // calculate front digit -> digit - (digit - n1) - (digit - n2)
		return digit + " - (" + digit + " - " + this.n1 + ") - (" + digit + " - "+this.n2+")";
	}
	
	public String backDigit () { // calculate back digit -> (digit - n1) * (digit - n2)
		return "(" + digit + " - " + this.n1 + ") * (" + digit + " - "+this.n2+")";		
	}

	public String arithmeticOperation (String expression) {
		// make arraylist
		ArrayList<String> elements = new ArrayList<String>();
		for (int i = 0; i < expression.split(" ").length; i++) {
			elements.add(expression.split(" ")[i]);
		}
		
		//calculation
		for (int i = 0; i < elements.size(); i++) {// precedence 1 : ()
			if (elements.get(i).contains("(")) {
				String str = elements.get(i);
				str = str.replace("(", "");
				elements.set(i,  str); // delete '(' from the element
				str = elements.get(i + 2);
				str = str.replace(")", "");
				elements.set(i + 2,  str); // delete ')' from the element
				
				if (elements.get(i + 1).equals("-")) { // subtract
					int minusOperation = Integer.parseInt(elements.get(i)) - Integer.parseInt(elements.get(i + 2));
					elements.set(i,  Integer.toString(minusOperation));
				} else if (elements.get(i + 1).equals("+")) { // add
					int plusOperation = Integer.parseInt(elements.get(i)) + Integer.parseInt(elements.get(i + 2));
					elements.set(i,  Integer.toString(plusOperation));
				} else {
				}
				elements.remove(i + 1); // remove operator and 2nd number after calculation
				elements.remove(i + 1); // remove operator and 2nd number after calculation
			} else {
			}
		}
		
		for (int i = 0; i < elements.size(); i++) {// precedence 2 : *, /
			if (elements.get(i).equals("*")) { // multiply
				int multiplyOperation = Integer.parseInt(elements.get(i - 1)) * Integer.parseInt(elements.get(i + 1));
				elements.set(i - 1,  Integer.toString(multiplyOperation));				
				elements.remove(i); // remove operator and 2nd number after calculation
				elements.remove(i); // remove operator and 2nd number after calculation	
			} else if (elements.get(i).equals("/")) { // divide
				if (!elements.get(i + 1).equals("0")) {
					int divideOperation = Integer.parseInt(elements.get(i - 1)) / Integer.parseInt(elements.get(i + 1));
					elements.set(i - 1,  Integer.toString(divideOperation));
				} else {
				}
				elements.remove(i); // remove operator and 2nd number after calculation
				elements.remove(i); // remove operator and 2nd number after calculation	
			} else {
			}
		}
		
		for (int i = 0; i < elements.size(); i++) {// precedence 3 : remains
			if (elements.get(i).equals("+")) { // add
				int addOperation = Integer.parseInt(elements.get(i - 1)) + Integer.parseInt(elements.get(i + 1));
				elements.set(i - 1,  Integer.toString(addOperation));				
				elements.remove(i); // remove operator and 2nd number after calculation
				elements.remove(i); // remove operator and 2nd number after calculation	
				i = 0;
			} else if (elements.get(i).equals("-")) { // subtract
				int subtractOperation = Integer.parseInt(elements.get(i - 1)) - Integer.parseInt(elements.get(i + 1));
				elements.set(i - 1, Integer.toString(subtractOperation));
				elements.remove(i); // remove operator and 2nd number after calculation
				elements.remove(i); // remove operator and 2nd number after calculation	
				i = 0;
			} else {
			}			
		}
		return elements.get(0);
			
	}
	
	
	public void isResult () { //show the answer
		String fd = arithmeticOperation(frontDigit());
		String bd = arithmeticOperation(backDigit());
		//calculating process
		System.out.println("front digit = " + fd + " -> " + frontDigit());
		System.out.println("back digit = " + bd + " -> " + backDigit());
		
		//result
		String answer = Integer.toString(Integer.parseInt(fd) * Integer.parseInt(digit) + Integer.parseInt(bd)); // fd*10 + bd		
		System.out.println("answer = " + answer);
	}

}
