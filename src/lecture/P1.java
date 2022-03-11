package lecture;

public class P1 {
	public static final int fathter = 1;
	public static final int mother = 2;
	public static final int son = 3;
	public static final int daughter = 4;
	
	//P1 : Printing a Name
//	public static void main(String[] args) {// case 1. create object
//		P1 p1 = new P1();
//		p1.familyMember(1);
//				
//	}
//	
//	public void familyMember(int num) {
//		if (num == 1) {
//			System.out.println("father");
//		} else if (num == 2) {
//			System.out.println("mother");
//		} else if (num == 3) {
//			System.out.println("son");
//		} else if (num == 4) {
//			System.out.println("daughter");
//		} else {
//			System.out.println("error");
//		}
//	}
//}

	public static void main(String[] args) {// case 2. do not create object
		familyMember(mother);			
	}

	public static void familyMember(int num) {
		if (num == 1) {
			System.out.println("father");
		} else if (num == 2) {
			System.out.println("mother");
		} else if (num == 3) {
			System.out.println("son");
		} else if (num == 4) {
			System.out.println("daughter");
		} else {
			System.out.println("error");
		}
	}
}	