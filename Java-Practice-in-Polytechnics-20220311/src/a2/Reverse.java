package a2;

public class Reverse {

	public int reverseNumber (int n) {  
		String nString = String.valueOf(n);
		String[] arr = nString.split("");
		String nStringReverse = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			nStringReverse = nStringReverse + arr[i];
		}
		int nReverse = Integer.parseInt(nStringReverse);
		return nReverse;
	}
}
