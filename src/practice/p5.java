package practice;
import java.util.Scanner;
public class p5 {
	public static void main(String[] args) {
		// P5 : Data Confirmation (there are conditions at least 5)

	    //set start menu
		Scanner scanner = new Scanner(System.in);
		System.out.println("P5 : Data Confirmation");
		System.out.println("condition 1 : 10 <= length <=20\ncondition 2 : user can not input character "
				+ "without English alphabet(upper&lowercase), numbers, specials(e.g. !@#$ in keyboard)\n"
				+ "condition 3 : user has to input at least 1 alphabet (it doesn't matter to input lower or upper case)\n"
				+ "condition 4 : user has to input at least 1 number\n"
				+ "condition 5 : user has to not input 'data', 'Data', 'DATA' etc... in the data");
		System.out.println("set data : ");
		String data = scanner.nextLine();
		boolean bool1 = true;
		boolean bool2 = true;
		boolean bool3 = false;
		boolean bool4 = false;	
		boolean bool5 = true;
		String arrOfData[] = data.split(""); 				
		// condition 1 : 10 <= length <=20
		if (data.length() < 10 || data.length() > 20) { //if user doesn't meet condition 1
			bool1 = false;
		} else {
		}
		for (int i = 0; i < arrOfData.length; i++) {
			// condition 2 : user can not input character 
			// without English alphabet(upper&lowercase), numbers, specials(e.g. !@#$ in keyboard)
			if ((int) data.charAt(i) < 33 || (int) data.charAt(i) > 126) {//if user doesn't meet condition 2
				bool2 = false;
			} else {				
			}
			// condition 3 : user has to input at least 1 alphabet (it doesn't matter to input lower or upper case)
			//if user meets condition 3
			if ((int) data.charAt(i) >= 65 && (int) data.charAt(i) <= 90 || (int) data.charAt(i) >= 97 && (int) data.charAt(i) <= 122) {
				bool3 = true;
			} else {
			}
			// condition 4 : user has to input at least 1 number
			if ((int) data.charAt(i) >= 48 && (int) data.charAt(i) <= 57) {//if user meets condition 4
				bool4 = true;
			} else {
			}	
			// condition 5 : user has to not input 'data', 'Data', 'DATA' etc... in the data
			if (data.toLowerCase().contains("data")) { //if user doesn't meet condition 5
				bool5 = false;
			}
		}		
		
		// print the result
		if (bool1 == true && bool2 == true && bool3 == true && bool4 == true && bool5 == true) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL\nCondition1 : " + bool1 + "\nCondition2 : " + bool2 + "\nCondition3 : " + bool3
					+ "\nCondition4 : " + bool4 + "\nCondition4 : " + bool4);
		}
	}
}
