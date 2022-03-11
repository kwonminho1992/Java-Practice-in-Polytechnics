package lecture;

public class P2 {
	//P2 : static final
	public static final int John = 30; // static final : variable can't change
	public static final int Mike = 35;	
	
	public static void printAge(int personAge) {
		System.out.println(personAge);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAge(John);
		
		printAge(John+2);
		
//		John = 45;		
//		printAge(John);
	}

}
