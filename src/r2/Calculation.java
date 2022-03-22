package r2;

public class Calculation {
	//constructors
	String today = "";
	String birthday = "";
	public Calculation(String today, String birthday) {
		this.today = today;
		this.birthday = birthday;
	}
	
	public void isAge () { // print ages (Korean age, international age)
		// [0] : year, [1] : month, [2] : date
		int[] arrBirthday = transferIntoArr(this.birthday);
		int[] arrToday = transferIntoArr(this.today);
		
		// Korean age
		int KoreanAge = arrToday[0] - arrBirthday[0] + 1;
		
		// international age 9 23老 积 - 9.23 捞傈 29技 捞饶 30技
		int internationalAge = arrToday[0] - arrBirthday[0];
		if (arrBirthday[1] > arrToday[1]) { // c1 : month birthday > month today -> -1
			internationalAge--;
		} else if (arrBirthday[1] == arrToday[1]) {
			if (arrBirthday[2] > arrToday[2]) { // c2 : date birthday > date today -> -1 (if birthday and today have same month)
				internationalAge--;
			} else {
			}
		} else {
		}
		//print ages
		System.out.println("Birthday : " + this.birthday + "\nToday : " + this.today + "\nKorean age : " + KoreanAge +
				"\nInternational age : " + internationalAge);
		System.out.println(arrBirthday[1] + " / " + arrBirthday[2]);
	}
	
	
	private int[] transferIntoArr (String day) { // transfer the day into arr (year, month, date)
		int[] arr = new int [3];
		arr[0] = Integer.parseInt(day.substring(0,4)); // year
		arr[1] = Integer.parseInt(day.substring(4,6)); // month
		arr[2] = Integer.parseInt(day.substring(6,8)); // date
		return arr;
	}
	
	private boolean leapYearOrNot(int year) { // calculate leap year
        boolean bool = true;
		if (year % 4 == 0) {
			bool = true;
              if (year % 100 == 0) {
                  if (year % 400 == 0) {
                	  bool = true;
                  }
                  else {
                	  bool = false;
                  }
              } else {
              }
          } else {
        	  bool = false;
          }
		// return
		if (bool == true) {
			return true;
		} else {
			return false;
		}
		}
	
	public boolean isRightFormOrNot () { // check user inputs birthday with right form or not
		boolean bool = true;
		if (this.birthday.length() != 8) { // condition 1 : user should keep length of input (yyyymmdd)
			bool = false;
		} else {			
		}
		
		for (int i = 0; i < this.birthday.length(); i++) { // condition 2 : user can input only integer
			if ((int) this.birthday.charAt(i) < 48 || (int) this.birthday.charAt(i) > 57) {
				bool = false;
				break;
			} else {
			}
		}
		int[] arr = transferIntoArr(this.birthday); // transfer user's input(birthday) into arr (year, month, date)
		int[] arrToday = transferIntoArr(this.today); // transfer today into arr (year, month, date)
		boolean leapYear = leapYearOrNot(arr[0]); // check leap year or not
		
		if (arr[0] > arrToday[0]) { // condition 3 : return false birthday's year > today's year
			bool = false;
		} else {
		}
		
		if (arr[1] < 1 || arr[1] > 12) { // condition 4 : return false month out of range 1~12
			bool = false;
		} else {
		}
		
		if (arr[1] == 1 && arr[2] < 1 || arr[1] == 1 && arr[2] > 31) { // condition 5 : set date cannot out of range (without February) 
			bool = false;
		} else {
		}
		if (leapYear == true && arr[1] == 2 && arr[2] < 1 || leapYear == true && arr[1] == 2 && arr[2] > 29) { //February (leap year)
			bool = false;
		} else if (leapYear == false && arr[1] == 2 &&arr[2] < 1 || leapYear == false && arr[1] == 2 && arr[2] > 28) { //February (not leap year)
			bool = false;
		} else {
		}
		if (arr[1] == 3 && arr[2] < 1 || arr[1] == 3 && arr[2] > 31) {
			bool = false;
		} else {
		}
		if (arr[1] == 4 && arr[2] < 1 || arr[1] == 4 && arr[2] > 30) { 
			bool = false;
		} else {
		}
		if (arr[1] == 5 && arr[2] < 1 || arr[1] == 5 && arr[2] > 31) { 
			bool = false;
		} else {
		}
		if (arr[1] == 6 && arr[2] < 1 || arr[1] == 6 && arr[2] > 30) {
			bool = false;
		} else {
		} 
		if (arr[1] == 7 && arr[2] < 1 || arr[1] == 7 && arr[2] > 31) { 
			bool = false;
		} else {
		}
		if (arr[1] == 8 && arr[2] < 1 || arr[1] == 8 && arr[2] > 31) { 
			bool = false;
		} else {
		}
		if (arr[1] == 9 && arr[2] < 1 || arr[1] == 9 && arr[2] > 30) { 
			bool = false;
		} else {
		}
		if (arr[1] == 10 && arr[2] < 1 || arr[1] == 10 && arr[2] > 31) { 
			bool = false;
		} else {
		}
		if (arr[1] == 11 && arr[2] < 1 || arr[1] == 11 && arr[2] > 30) { 
			bool = false;
		} else {
		}
		if (arr[1] == 12 && arr[2] < 1 || arr[1] == 12 && arr[2] > 31) { 
			bool = false;
		} else {
		}
		//return
		System.out.println(arr[1] + " / " + arr[2]);
		if (bool == true) {
			return true;
		} else {
			return false;
		}
	}
}
