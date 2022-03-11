package lecture;

public class P4 {
	//P4 : Calculator
	public static void main(String[] args) {
		
		System.out.println(addition(4, 5));
		System.out.println(division(5, 0));
	}
	
	public static String addition (double a, double b) {
		String result = String.valueOf(a + b);
		result = String.valueOf(a) + " + " + String.valueOf(b) + " = " + result;
		return result;
	}
	public static String subtraction (double a, double b) {
		String result = String.valueOf(a - b);
		result = String.valueOf(a) + " - " + String.valueOf(b) + " = " + result;
		return result;
	}
	public static String multiplication (double a, double b) {
		String result = String.valueOf(a * b);
		result = String.valueOf(a) + " * " + String.valueOf(b) + " = " + result;
		return result;
	}
	public static String division (double a, double b) {
		if (b != 0) {
			String result = String.valueOf(a / b);
			result = String.valueOf(a) + " / " + String.valueOf(b) + " = " + result;
			return result;
		} else {
			String result = "ERROR : You can not divide by 0";
			return result;
		}
	}
}
