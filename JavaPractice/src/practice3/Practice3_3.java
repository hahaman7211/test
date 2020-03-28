package practice3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practice3_3 {

	public static void main(String[] args)  {		
		//Scanner kb = new Scanner(System.in);	
		
		try ( 	Scanner input = new Scanner(new FileInputStream("Lotto.txt")); 
				PrintWriter output = 
				new PrintWriter(new FileOutputStream("C:\\Users\\haham\\Desktop\\Lotto_new.txt", false));
				Scanner kb = new Scanner(System.in);   ) 	{
		
			System.out.print("enter a number: ");
			int n = kb.nextInt();
			int count = 1;
			while (input.hasNext()) {
				String str = input.nextLine();
				if (count == n) {
					output.print(str);
					output.println();
					break;
				}
				count++;
			}
			System.out.print(count);
		}		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
