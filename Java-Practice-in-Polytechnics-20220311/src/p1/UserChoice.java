package p1;

public class UserChoice {
	int choice; 
	
	public UserChoice (int choiceOfUser) { // constructor
		choice = choiceOfUser;
	}
	
	public void pirntPrice () { // print the price
		if (this.choice == 1) {
			System.out.println("1. apple : 2$");			
		} else if (this.choice == 2) {
			System.out.println("2. strawberry : 3$");	
		} else if (this.choice == 3) {
			System.out.println("3. grape : 4$");	
		} else if (this.choice == 4) {
			System.out.println("4. watermelon : 5$");	
		} else {
			System.out.println("error");	
		}
	}
}
