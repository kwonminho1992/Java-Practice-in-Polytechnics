package lecture;


public class main {
		
	public static void main(String[] args) {
	// call methods		
	showMyMoney1();
	main main = new main();
	
	main.showMyMoney2();
	main.showMyMoney3();
	main.showMyMoney4();
	main.showMyMoney5();
	main.showMyMoney6(2000);
	
	print("text");
	print(5, 6);
	print();
	int sum = addOperation(4, 6);
	System.out.println("return : " + sum);
	System.out.println(sumToOne(6));
	}

	// function with no parameters
	public static void showMyMoney1() { // 공개된 함수, 객체를 생성할 필요 없음
		System.out.println("showMyMoney1 : 1000$");
	}
	
	public void showMyMoney2() { // 공개된 함수이지만, 객체를 먼저 생성하고 써야함
		System.out.println("showMyMoney2 : 1000$");
	}
	
	private void showMyMoney3() {
		System.out.println("showMyMoney3 : 1000$");
	}

	protected void showMyMoney4() {
		System.out.println("showMyMoney4 : 1000$");
	}
	
	void showMyMoney5() {
		System.out.println("showMyMoney5 : 1000$");
	}
	
	//function with parameters
	public void showMyMoney6(int number) {
		System.out.println("showMyMoney6 : " + number + "$");
	}


	//overloading
	public static void print (String text) {
		System.out.println(text);
	}
	public static void print (int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	public static void print () {
		System.out.println("default value");
	}
	
	//return
	public static int addOperation (int a, int b) {
		int sum = a + b;
		return sum;
	}	
	
	//Recursive Function (재귀함수)
	public static int sumToOne (int number) {
		if (number <= 1) {
			return 0;
		} else {
			return number + sumToOne(number-1);
		}
	}

	
}