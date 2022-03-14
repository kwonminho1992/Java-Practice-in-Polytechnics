package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		// P4 : Encryption and Decryption
		System.out.println("P4 : Encryption and Decryption");
		
		// set var
		Scanner scanner = new Scanner(System.in);
		String encryptionNotReversed = "";
		String encryption = "";		
		String decryption = "";	
		boolean checkData = true;
		ArrayList<Integer> arrData = new ArrayList<Integer>();
		ArrayList<Integer> arrDataReversed = new ArrayList<Integer>();
		ArrayList<Integer> arrForDecryption = new ArrayList<Integer>();
		
		//user choose encryption or decryption
		System.out.println("1. Encryption\n2. Decryption");
		int choice = scanner.nextInt();

			
		if (choice == 1) {// encryption
			//user inputs string
			System.out.println("You should input string before encryption : \n"
					+ "(*10<=length<=20, only alphabets, numbers, and specials allowed)");
			Scanner scanner2 = new Scanner(System.in);
			String data = scanner2.nextLine();
			//detect errors
			if (data.length() < 10 || data.length() > 20) { 
				checkData = false;
			} else {
				boolean checkSecondCondition = true;
				for (int i = 0; i < data.length(); i++) {
					if ((int) data.charAt(i) < 33 || (int) data.charAt(i) > 126) {
						checkData = false;
					} else {
					}
				}
			}
			// proceed encryption
			if (checkData = true) {						
				for (int j = 0; j < data.length(); j++) {// step 1 : change all chars to ints and put into arr
						arrData.add(data.charAt(j)+300);
				}
				for (int j = arrData.size() - 1; j >= 0; j--) {// step 2 : reverse arr
					arrDataReversed.add(arrData.get(j));
				}
				for (int j = arrData.size() - 1; j >= 0; j--) {// step3 : make a string
					encryptionNotReversed = encryptionNotReversed + Integer.toString(arrDataReversed.get(j));
				}
				for (int j = encryptionNotReversed.length() - 1; j >= 0; j--) {// step4 : change order
					encryption = encryption + encryptionNotReversed.charAt(j);
				}			
								
				// print the encryption result
				System.out.println("result : " + encryption);
			} else {
			}
		} else if (choice == 2) {// decryption
			//user inputs string encrypted
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("input encrypted string : ");
			String dataEncrypted = scanner3.nextLine();			
			for (int i = dataEncrypted.length() - 1; i >= 0; i--) { // step 1 : return order
				encryptionNotReversed = encryptionNotReversed + dataEncrypted.charAt(i);
			}
			String chars = "";
			for (int i = 0; i < encryptionNotReversed.length(); i = i + 3) { // step 2 : make an array
				chars = String.valueOf(encryptionNotReversed.charAt(i)) + 
						String.valueOf(encryptionNotReversed.charAt(i+1)) + String.valueOf(encryptionNotReversed.charAt(i+2));
				arrForDecryption.add(Integer.parseInt(chars)-300);
			}
			for (int i = 0; i < arrForDecryption.size(); i++) { // step 3 : change to ascii characters
				int num = arrForDecryption.get(i);
				char eachChar = (char) num;
				decryption = decryption + String.valueOf(eachChar);
			}
			
			// print the decryption result
			System.out.println("result : " + decryption);						
		}
	}
}