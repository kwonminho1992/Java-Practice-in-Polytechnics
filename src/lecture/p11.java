package lecture;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		// Currency Converter
		
		// 1 krw = 0.00081 usd
		// 1 usd = 1,227.58 krw
		// 1krw = 18.62 vnd
		
		//exchange rate
		float krwTousd = 0.00081f;
		float usdTokrw = 1227.58f;
		float krwTovnd = 18.62f;
		float money = 0;
		
		System.out.println("Currency Converter\n1. KRW -> USD\n2. USD -> KRW\n3. KRW -> VND");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		float input = scanner.nextInt();
		switch (choice) {
			case 1: // krw to usd
				money = input * krwTousd;
				System.out.println("Your money in USD is : " + money);
				break;
				
			case 2: // usd to krw
				money = input * usdTokrw;
				money = (int) money;
				System.out.println("Your money in KRW is : " + Math.round(money));			
				break;
	
			case 3: // krw to vnd
				money = input * krwTovnd;
				money = (int) money;
				System.out.println("Your money in VND is : " + Math.round(money));		
				break;
			
			default:
				System.out.println("ERROR");
		}
		
		
		
		

	}

}
