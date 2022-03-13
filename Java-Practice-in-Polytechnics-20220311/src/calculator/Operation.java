package calculator;

public class Operation {
	double c = 0.0; // global variable
	double d = 0.0;
	
	public Operation (double a, double b) { // constructor
		c = a;
		d = b;
	}
	
	public double addition () { // method applying constructor
		return c + d;
	}
	
	public double subtraction () {// method applying constructor
		return c - d;
	}	
	
	public double multiplication (double x, double y) {// method not applying constructor
		return x * y;
	}	
	
	public double division (double x, double y) {// method not applying constructor
		if (y != 0) {
			return x / y;
		} else {
			return 0;
		}
	}	
}
