package lecture;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class classExample = new Class(); // call the class in lecture package
		
		classExample.showDate(); // call the methods in the class
		classExample.showTime();
		System.out.println(classExample.day);
		System.out.println(classExample.month);
		System.out.println(classExample.year);
		System.out.println(Class.year); // don't need to create object
		
		
	}

}
