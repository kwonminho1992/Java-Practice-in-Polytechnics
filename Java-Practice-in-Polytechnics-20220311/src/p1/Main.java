package p1;

public class Main {

	public static void main(String[] args) {
		// P1 : Constructor Example
		UI ui = new UI();
		ui.showMenu(); 
		int n = ui.userSelectMenu();
		UserChoice userChoice = new UserChoice(n);
		
		userChoice.pirntPrice();
	}

}
