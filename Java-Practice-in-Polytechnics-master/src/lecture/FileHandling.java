package lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// File
		File file = new File("C:\\Users\\kwonminho.DESKTOP-1VD3F43\\Desktop\\lecture\\기본프로그래밍_Java");
		File[] files = file.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
		
//		// File handling (read)
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("C:\\Test\\kopo45.txt"));
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		// File handling (write)
//		try {
//			FileWriter fw = new FileWriter("C:\\Test\\kopo45.txt");		
//			for (int i = 0; i < 16; i++) {
//				String data = "Line #" + i + "\n";
//				fw.write(data);
//			}
//			fw.close();
//		} catch (IOException e) {
//			e.printStackTrace();			
//		}
		

	}

}
