package lecture;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class classPractice {

	public static void main(String[] args) {
		// Date class
//		Date date = new Date();
//		System.out.println(date.toString());
//		System.out.println(date.getMonth()+1);
//		System.out.println(date.getYear()+1900);
//		System.out.println(date.after(date));
		
//		//Calendar class
//		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar.getTime());
//		System.out.println(calendar.get(Calendar.YEAR));	
//		System.out.println(calendar.get(Calendar.MONTH));
//		System.out.println(calendar.get(Calendar.DATE));
//		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
//		System.out.println(calendar.get(Calendar.HOUR));
//		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//		System.out.println(calendar.get(Calendar.MINUTE));
//		System.out.println(calendar.get(Calendar.SECOND));
//		System.out.println(calendar.get(Calendar.MILLISECOND));	
		
		//Math class
//		int min = Math.min(3, 13);
//		int max = Math.max(3, 13);
//		int abs = Math.abs(-211);
//		System.out.println(min + "\n" + max + "\n" + abs);
//		System.out.println(Math.random());
//		
//		for (int i = 0; i < 6; i++) {
//			double num = Math.random() * 45;
//			System.out.println((int) num);
//		}
		

//		//Time Zone class
//		TimeZone time;
//		Date date = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		
//		time = TimeZone.getTimeZone("Asia/Tokyo");
//		dateFormat.setTimeZone(time);
//		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
//		//String
//		String text = "How are you?,I'm fine thank you and you?";
//		System.out.println(text);
//		System.out.println(text.length());
//		for (int i = 0; i < text.length(); i++) {
//			System.out.println(text.charAt(i));
//		}
//		
//		char[] c = text.toCharArray();
//		System.out.println(c[0]);
//		System.out.println(c[1]);
//		
//		System.out.println(text.replace("H", "h"));
//		
//		String[] t = text.split(",");
//		System.out.println(t[0]);
//		System.out.println(t[1]);

		//Numeric class
		String text = "-31.5121212122123123123";
		System.out.println("text : " + text);
		System.out.println("Float.parseFloat(text) : " + Float.parseFloat(text));
		System.out.println("Double.parseDouble(text) : " + Double.parseDouble(text));
		Double d = Double.parseDouble(text);
		System.out.println("d : " + d);
		System.out.println("d.intValue() : " + d.intValue());
		BigDecimal bd = new BigDecimal(text);
		System.out.println("bd : " + bd);
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));
		float f = 3.26f;
		System.out.println("f : " + f);
		System.out.println("(int)f : " + (int)f);
		
		
		String line = "5*3.5";
		//cutting String start point to before "*"
		String num1 = line.substring(0, line.indexOf("*"));
		//cutting String * to end
		String num2 = line.substring(line.indexOf("*")+1, line.length());		
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}

}
