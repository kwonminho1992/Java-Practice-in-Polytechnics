package lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
//		// Try ~ Catch example1
//		
//		int[] numbers = {1, 2, 3};
//		
//		// catch each errors
//		try {
//			System.out.println(numbers[32]);
//			System.out.println("1");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("2");
//		} catch (Exception e) { // can catch all kind of errors
//			e.printStackTrace();
//			System.out.println("3");
//		} finally { // execute regardless of try, catch
//			System.out.println("finally");
//		}
//		System.out.println("COMPLETE");

		// Try ~ Catch example2
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		try {
			num = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("FINISH");
	}

}
