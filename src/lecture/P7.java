package lecture;

public class P7 {

	public static void main(String[] args) {
		// P7 : Factorial
		int a = factorial(5);
		System.out.println(a);
	}
	
	public static int factorial (int n) {
		if (n <= 1) {
			return n;
		} else {
			return n * factorial(n-1);
		}
		

	}

}
