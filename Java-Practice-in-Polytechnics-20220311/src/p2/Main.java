package p2;

public class Main {

	public static void main(String[] args) {
		// P2 : Creating Game Characters
		Character c1 = new Character("A", 15, 125.3, 6.1);
		Character c2 = new Character("B", 25, 235.3, 367.1);
		Character c3 = new Character("C", 54, 257.3, 306.1);
		Character c4 = new Character();		
		
		c1.introduceCharacter();
		c2.introduceCharacter();
		c3.introduceCharacter();
		c4.introduceCharacter();
	}

}
