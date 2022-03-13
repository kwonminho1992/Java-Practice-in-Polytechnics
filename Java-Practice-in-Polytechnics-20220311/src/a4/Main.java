package a4;

public class Main {

	public static void main(String[] args) {
		// A4 : Finding the Nearest Number
		UI ui = new UI();
		Calculation calcultation = new Calculation();
		
		System.out.println("A4 : Finding the Nearest Number");
		
		String numbers = ui.inputNumbers(); // user inputs numbers (ex. 22.1 45 -80 ...)
		double number = ui.chooseNumber(); // user chooses one number 
		double result = calcultation.calculateNearestNumber(numbers, number); // find the nearest number
		System.out.println("The nearest number is : " + result);
	}

}
