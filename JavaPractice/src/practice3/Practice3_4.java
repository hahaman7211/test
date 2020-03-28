package practice3;

import java.io.FileNotFoundException;

public class Practice3_4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		String fileName;
		Practice3_1 p3_1 = new Practice3_1();

		for(int i=1; i<21; i++) {		
			String number = String.format("%02d", i);
			fileName = "C:\\Users\\haham\\Desktop\\Lotto" + number + ".txt";
			p3_1.getlottery(fileName);
	
		}
	
	}

}
