package Polymorphism;

public class Main extends Parent{

	public static void main(String[] args) {
		// Polymorphism
		Parent p1 = new Parent(); // possible
		Parent p2 = new Main(); // possible
		//Main p3 = new Parent(); // error
		Parent p4 = new Child1(); // possible
		Parent p5 = new Child2(); // possible
	}

}
