package arrayexamples;

public class ArrayExample {

	public static void main(String[] args) {
		// Array
		int[] numbers = new int[10];
		String[] names = {"kim", "lee", "park"};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}	
		
		// System.out.println(names[3]); // error

		//Multidimensional Array
		int[][] multidimensionalNumbers = new int[3][5];
		int cnt;
		cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				multidimensionalNumbers[i][j] = cnt;
				cnt++;
			}
		}
		
		
		//min, max
		int[] nums = {2, 33, 7, 5, 12, 34};
		int min = nums[0];
		int max = nums[0];
		//min
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		//max
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println(min + " / " + max);
	}

}
