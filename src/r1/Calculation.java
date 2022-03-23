package r1;

public class Calculation {
	//constructor
	int n1 = 0;
	int n2 = 0;
	public Calculation(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	private static int digit = 10; //digit set to calculate
	
	public boolean isRightFormOrNot () { // user can't input 0
		if (this.n1 == 0 || this.n2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	private int frontDigit () { // calculate front digit
		int n1ForAddition = digit - this.n1; // digit - n1
		int n2ForAddition = digit - this.n2; // digit - n2
		return digit - (n1ForAddition + n2ForAddition);
	}
	
	private int BackDigit () { // calculate back digit
		int n1ForAddition = digit - this.n1; // digit - n1
		int n2ForAddition = digit - this.n2; // digit - n2
		return n1ForAddition * n2ForAddition;		
	}
	
	public void isResult () { //show the answer
		int fd = frontDigit();
		int bd = BackDigit();
		//calculating process
		System.out.println("front digit = " + fd + " [" + digit + " - (" +  digit + " - " + this.n1 + ")" +
				" - (" +  digit + " - " + this.n2 + ")]");
		System.out.println("back digit = " + bd + " [(" +  digit + " - " + this.n1 + ")" + " * (" +  digit + " - " + this.n2 + ")]");
		
		//result
		int bd2 = bd % digit; // get 1 digit of bd
		int fd2 = fd + (bd / digit); // get 10 digit¡è of bd and then add to fd
		int answer = (fd2 * digit) + bd2;
		System.out.println("answer = " + answer);
	}
}
