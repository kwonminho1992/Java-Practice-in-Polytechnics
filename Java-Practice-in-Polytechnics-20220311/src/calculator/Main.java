package calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation operation = new Operation(3, 4);
		UserInterface userinterface = new UserInterface();
		
		userinterface.showMenu();
		System.out.println(operation.addition());
		System.out.println(operation.division(6, 43));
	}

}
