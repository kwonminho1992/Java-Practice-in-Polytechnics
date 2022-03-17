package homework;

import java.util.Scanner;

public class A3 {
	public static String[] positions = {"rock", "scissor", "paper"}; 
	public static void main(String[] args) {
		// A3 : Rock-Paper-Scissors Game
		System.out.println("A3 : Rock-Paper-Scissors Game");
		while (true) {
			String user = resultOfUser();
			String computer = resultOfComputer();
			showResult(user, computer);
		}
	}
	
	public static String resultOfComputer() {
		//make random numbers (1~3)
		int n = (int) (Math.random() * 3);
		
		// return rock, scissor or paper
		if (n == 1) { //rock
			return positions[0];
		} else if (n == 2) { // scissor
			return positions[1];
		} else { // paper
			return positions[2];
		}
	}
	
	public static String resultOfUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You can input rock, scissor or paper (both upper and lower case available)\n"
				+ "*if you input wrong spelling, Your position will be determined automatically");
		String text = scanner.nextLine();
		// return rock, scissor or paper
		if (text.toLowerCase().contains("rock")) {
			return positions[0];
		} else if (text.toLowerCase().contains("scissor")) {
			return positions[1];
		} else if (text.toLowerCase().contains("paper")) { // occur error
			return positions[2];
		} else {
			return resultOfComputer();
		}

	}
	
	public static void showResult(String user, String computer) {
		System.out.println("user : " + user + "\ncomputer : " + computer);
		if (user.equals(computer)) { // tie
			System.out.println("tie");
		} else if (user == "rock" && computer == "scissor") {
			System.out.println("You win");
		} else if (user == "rock" && computer == "paper") {
			System.out.println("Computer wins");
		} else if (user == "scissor" && computer == "rock") {
			System.out.println("Computer wins");
		} else if (user == "scissor" && computer == "paper") {
			System.out.println("You win");
		} else if (user == "paper" && computer == "rock") {
			System.out.println("You win");
		} else {
			System.out.println("Computer wins");
		}
	}

}
