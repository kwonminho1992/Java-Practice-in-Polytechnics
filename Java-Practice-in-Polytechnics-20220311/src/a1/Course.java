package a1;

public class Course {
	UI ui = new UI();
	
	String myCourse = "My Course\n";
	String lec1 = ui.lec1;
	String lec2 = ui.lec2;
	String lec3 = ui.lec3;
	String lec4 = ui.lec4;
	String lec5 = ui.lec5;
	String lec6 = ui.lec6;
	String lec7 = ui.lec7;
	
	public int userChoose(int menu) {
		if (menu == 1) { // show course list
			return ui.showCourse();
		} else if (menu == 2) { // show MY course list
			System.out.print(myCourse);
			return 0;
		} else { // error
			return 0;
		}		
	}
	
	public String chooseLecture(int course) { //user chooses course and inputs to my course list
		if (course == 1 && !myCourse.contains(lec1)) {
			myCourse = myCourse + lec1;
			return lec1 + " IS CHOICED!";
		} else if (course == 2 && !myCourse.contains(lec2)) {
			myCourse = myCourse + lec2;
			return lec2 + " IS CHOICED!";
		} else if (course == 3 && !myCourse.contains(lec3)) {
			myCourse = myCourse + lec3;
			return lec3 + " IS CHOICED!";
		} else if (course == 4 && !myCourse.contains(lec4)) {
			myCourse = myCourse + lec4;
			return lec4 + " IS CHOICED!";
		} else if (course == 5 && !myCourse.contains(lec5)) {
			myCourse = myCourse + lec5;
			return lec5 + " IS CHOICED!";
		} else if (course == 6 && !myCourse.contains(lec6)) {
			myCourse = myCourse + lec6;
			return lec6 + " IS CHOICED!";
		} else if (course == 7 && !myCourse.contains(lec7)) {
			myCourse = myCourse + lec7;
			return lec7 + " IS CHOICED!";
		} else {
			return "You chose the lecture already chosen or wrong lecture";
		}
	}	
}
