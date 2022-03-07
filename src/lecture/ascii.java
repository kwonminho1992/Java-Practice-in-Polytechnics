package lecture;

public class ascii {

	public static void main(String[] args) {
		// ASCII code
		System.out.println((int)'3');
		System.out.println((int)'!');
		System.out.println((int)'A');
		
		//changing cases. upper case : 65~90 / lower case : 97~122
		String line = "I am a boy";
		System.out.println(line);
		int i = 0;
		int j = 'a';
		String str = new Character((char) j).toString();
		for (i = 0; i < 10; i++) {
			if ((int)line.charAt(i)>=65 && (int)line.charAt(i)<=90) {
				j = (int)line.charAt(i)+22;
				System.out.print(str.toString());
			} else if ((int)line.charAt(i)>=97 && (int)line.charAt(i)<=122) {
				j = (int)line.charAt(i)-22;
				System.out.print(str.toString());	
			} else {
				System.out.print(line.charAt(i));
			}
		}
	}
}
