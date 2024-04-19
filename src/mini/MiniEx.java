package mini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "PhoneDB.txt";

	public static void main (String[] args) {
		//	시작화면
		Phone();
		
//		List<MiniEx> lpd = new ArrayList<>();

		try {
			List<MiniEx> lpd = new ArrayList<>();
			File file = new File("C:\\Users\\하이미디어학원\\Downloads\\files\\files\\PhoneDB.txt");
			Scanner sc = new Scanner(file);
			String name;
			String num;
			String tel;
			
			
			while(sc.hasNextLine()) {
				name = sc.next();
				num = sc.next();
				tel = sc.next();
				System.out.println(name + num + tel);
			}
		} catch(FileNotFoundException e) {
			System.out.println("no");
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

	
}
	
	private static void Phone() {
	
		
	}
}
