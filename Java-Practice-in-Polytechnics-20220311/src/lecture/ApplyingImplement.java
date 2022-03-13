package lecture;

public class ApplyingImplement implements Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplyingImplement main = new ApplyingImplement();
		
		main.getPriceA(100);
		main.getPriceB(500);
	}
	
	@Override
	public void getPriceA (int price) {
		System.out.println(price);
	}
	@Override
	public void getPriceB (int price) {
		System.out.println(price);
	}	
}
