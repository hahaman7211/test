package practice2;


import java.io.IOException;
import java.util.Scanner;

public class Practice2_2 {
	
	public static void main(String[] args) throws IOException {
		Practice2_2 pp = new Practice2_2();
		System.out.println(pp.idCardVerification());	
	}
	
	public String idCardVerification() {
		Scanner kb = new Scanner(System.in);
		System.out.print("enter: ");
		String str = kb.nextLine();
		str = str.toUpperCase();
		
		int first = 0;
		String f = str.charAt(0) + "";
		
		if(f.equals("A"))
			first = 10;
		else if(f.equals("B"))
			first = 11;
		else if(f.equals("C"))
			first = 12;
		else if(f.equals("D"))
			first = 13;
		else if(f.equals("E"))
			first = 14;
		else if(f.equals("F"))
			first = 15;
		else if(f.equals("G"))
			first = 16;
		else if(f.equals("H"))
			first = 17;
		else if(f.equals("I"))
			first = 34;
		else if(f.equals("J"))
			first = 18;
		else if(f.equals("K"))
			first = 19;
		else if(f.equals("L"))
			first = 20;
		else if(f.equals("M"))
			first = 21;
		else if(f.equals("N"))
			first = 22;
		else if(f.equals("O"))
			first = 35;
		else if(f.equals("P"))
			first = 23;
		else if(f.equals("Q"))
			first = 24;
		else if(f.equals("R"))
			first = 25;
		else if(f.equals("S"))
			first = 26;
		else if(f.equals("T"))
			first = 27;
		else if(f.equals("U"))
			first = 28;
		else if(f.equals("V"))
			first = 29;
		else if(f.equals("W"))
			first = 32;
		else if(f.equals("X"))
			first = 30;
		else if(f.equals("Y"))
			first = 31;
		else if(f.equals("Z"))
			first = 33;
		
		first = (first%10)*9 + first/10;
		//System.out.println("first " + first);
		
		int count = 8;
		int temp;
		for(int i=1; i<str.length()-1; i++)
		{
			f = str.charAt(i) + "";
			temp = Integer.parseInt(f);
			first = first + temp*count;		
			count--;				
		}
		
		int rest = (10 - first%10) %10;
		f = str.charAt(9) + "";
		String answer;
		if(rest == Integer.parseInt(f))
			answer = "Correct";
		else
			answer = "Wrong";
		
		kb.close();
		
		return answer;
	
	}

}
