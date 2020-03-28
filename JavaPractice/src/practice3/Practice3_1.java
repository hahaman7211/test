package practice3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import practice2.Practice2_1;

public class Practice3_1 {

	public void getlottery(String str) throws FileNotFoundException {

		try (PrintWriter output = new PrintWriter(new FileOutputStream(str, false));) {
			
			
			Practice2_1 p1 = new Practice2_1();

			for (int i = 1; i < 101; i++) {
				String[] ar = p1.playLotto();
				output.print(i + ": ");
				for (int j = 0; j < ar.length; j++) {
					output.print(ar[j] + " ");
				}
				output.println();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// log.info("");
			throw e;
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		Practice3_1 p3_1 = new Practice3_1();
		p3_1.getlottery("Lotto.txt");

	}
	
	


}
