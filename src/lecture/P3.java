package lecture;

public class P3 {
	//P3 : Printing a Name2 (applying final static)
	public static final String fathter = "Jaein";
	public static final String mother = "Jungsook";
	public static final String son = "Joonyong";
	public static final String daughter = "Dahye";
	


	public static void main(String[] args) {// case 2. do not create object
		familyMember("Jaein");			
	}

	public static void familyMember(String name) {
		if (name == "Jaein") {
			System.out.println("father");
		} else if (name == "Jungsook") {
			System.out.println("mother");
		} else if (name == "Joonyong") {
			System.out.println("son");
		} else if (name == "Dahye") {
			System.out.println("daughter");
		} else {
			System.out.println("error");
		}
	}
}	

