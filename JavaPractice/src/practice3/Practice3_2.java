package practice3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice3_2 {

	public static void main(String[] args) {
		Date date = new Date();
		// System.out.print(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String theday = format.format(date);
		// System.out.print(theday);
		Scanner input;

		try (PrintWriter output = new PrintWriter(
				new FileOutputStream("C:\\Users\\haham\\Desktop\\Lotto_" + theday + ".txt", false));) {

			input = new Scanner(new FileInputStream("Lotto.txt"));
			/*
			 * PrintWriter output = new PrintWriter( new
			 * FileOutputStream("C:\\Users\\Public\\Lotto_" + theday + ".txt", false));
			 */
			while (input.hasNextLine()) {
				String str = input.nextLine();
				output.print(str);
				output.println();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
