package p4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintClass pt = new PrintClass(1004);
		int n = pt.getNum();
		System.out.println(n);
		
		//inner class
		InnerClass.printInner();
		
	}
	
	public static class InnerClass {
		public InnerClass() {
		}
		public static void printInner() {
			System.out.println("inner class");
		}
	}

}

// additional class
class PrintClass {
	int num = 0;

	public PrintClass (int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
}