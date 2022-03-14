package lecture;
import java.util.Arrays;
import java.util.stream.IntStream;

public class P4 {

	public static void main(String[] args) {
		// P4 : Sort
		
		//ascending order
		System.out.print("Ascending order : ");
		int[] numbersAsc = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		int[] numbersAscSpare = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		int asc = numbersAsc[0];
		for (int i = 0; i < numbersAscSpare.length; i++) {
			asc = numbersAsc[0];
			for (int j = 0; j < numbersAsc.length; j++) {
				if (numbersAsc[j] < asc) {
					asc = numbersAsc[j];
				} else {
				}				
			}
			System.out.print(asc + ", "); // print
			for (int j = 0; j < numbersAsc.length; j++) {
				if (numbersAsc[j] == asc) {
					numbersAsc = removeTheElement(numbersAsc, j); // delete the min
				} else {
				}
			}
		}
		System.out.println("");
		//descending order
		System.out.print("Descending order : ");
		int[] numbersDes = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		int[] numbersDesSpare = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		int des = numbersDes[0];
		for (int i = 0; i < numbersDesSpare.length; i++) {
			des = numbersDes[0];
			for (int j = 0; j < numbersDes.length; j++) {
				if (numbersDes[j] > des) {
					des = numbersDes[j];
				} else {
				}				
			}
			System.out.print(des + ", "); // print
			for (int j = 0; j < numbersDes.length; j++) {
				if (numbersDes[j] == des) {
					numbersDes = removeTheElement(numbersDes, j); // delete the min
				} else {
				}
			}
		}
	}
		
	
    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index)
    {
 
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
            || index < 0
            || index >= arr.length) {
 
            return arr;
        }
 
        // return the resultant array
        return IntStream.range(0, arr.length)
            .filter(i -> i != index)
            .map(i -> arr[i])
            .toArray();
    }
}
