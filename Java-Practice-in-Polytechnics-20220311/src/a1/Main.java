package a1;

public class Main {

	public static void main(String[] args) {
		// A1 : Course Registration Program
		System.out.println("A1 : Course Registration Program");
		UI ui = new UI();
		Course course = new Course();
		
		while (true) {
			//show menu 
			int menu = ui.showMenu();		
			int showMenu = course.userChoose(menu);
			System.out.println(showMenu);
			
			//choose lectures
			String showLectures = course.chooseLecture(showMenu);
			System.out.println(showLectures);
		}
	}	
}	

