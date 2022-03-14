package lecture;

public class P5 {

	public static void main(String[] args) {
		// P5 : Descriptive Statistics
		
		//dimension 1 : Jeong, Pyo, Choi, Mike
		//dimension 2 : Korean, English, Math
		int[][] scores = {{70, 80, 100}, {60, 70, 86},
			{54, 100, 82}, {87, 95, 79}};
		String[] names = {"Jeong", "Pyo", "Choi", "Mike"};
		String[] lectures = {"Korean", "English", "Math"};
		
		// average of each students
		for (int i = 0; i < scores.length; i++) {
			double average = 0;
			for (int j = 0; j < scores[i].length; j++) {
				average = average + scores[i][j];
			}
			System.out.println("AVERAGE of " + names[i] + " : " + (average / scores.length));
		}
		
		// max of each students
		for (int i = 0; i < scores.length; i++) {
			int max = scores[i][0];
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] > max) {
					max = scores[i][j];
				} else {
				}
			}
			System.out.println("MAX of " + names[i] + " : " + max);
		}
		
		// min of each students
		for (int i = 0; i < scores.length; i++) {
			int min = scores[i][0];
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] < min) {
					min = scores[i][j];
				} else {
				}
			}
			System.out.println("MIN of " + names[i] + " : " + min);
		}
		
		// average of each lectures;
		for (int i = 0; i < lectures.length; i++) { // 3
			int[] scoresOfStudents = new int[scores.length]; // 4
			double averageOfStudents = 0;
			for (int j = 0; j < scores.length; j++) { // 4
				scoresOfStudents[j] = scores[j][i]; // 4
				averageOfStudents = averageOfStudents + scoresOfStudents[j];
			}
			averageOfStudents = averageOfStudents / scores.length;
			System.out.println("Average of " + lectures[i] + " : " + averageOfStudents);
		}
		
		// max of each lectures;
		for (int i = 0; i < lectures.length; i++) { // 3
			int[] scoresOfStudents = new int[scores.length]; // 4
			int maxOfStudents = -9999;
			for (int j = 0; j < scores.length; j++) { // 4
				scoresOfStudents[j] = scores[j][i]; // 4
				if (maxOfStudents < scoresOfStudents[j]) {
					maxOfStudents = scoresOfStudents[j];
				}
			}
			System.out.println("MAX of " + lectures[i] + " : " + maxOfStudents);
		}
		
		// min of each lectures;
		for (int i = 0; i < lectures.length; i++) { // 3
			int[] scoresOfStudents = new int[scores.length]; // 4
			int minOfStudents = 9999;
			for (int j = 0; j < scores.length; j++) { // 4
				scoresOfStudents[j] = scores[j][i]; // 4
				if (minOfStudents > scoresOfStudents[j]) {
					minOfStudents = scoresOfStudents[j];
				}
			}
			System.out.println("MIN of " + lectures[i] + " : " + minOfStudents);
		}	
		
	}

	
}
