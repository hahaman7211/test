package practice2;

import java.util.Random;

public class Practice2_3 {
	
	public String idCardProduce() {
		String letter = "ABCDEFGHJKLMNPQRSTUVXYWZIO";	
		Random rd = new Random();
		int t;
		String str = "";
		
		//check number
		int checknum = 0;
		
		t = rd.nextInt(26)+65;
		
		//first letter
		str = str + (char)t;
		System.out.println(str);
		
		t = letter.indexOf( (char)t ) + 10;
		
		checknum = checknum + t/10;
		checknum = checknum + t%10*9;
		
		//generate first number ( 1 or 2)
		str = str + Integer.toString( t = rd.nextInt(2)+1 );
		System.out.println(str);
		checknum = checknum + t*8;
		
		//generate 2-8 number
		for(int i=7; i>0; i--) {		
			str = str + Integer.toString( t = rd.nextInt(10) );
			checknum = checknum + t*i;
		}	
		System.out.println(str);	 
		checknum = (10 - (checknum%10)) % 10;
		str = str + Integer.toString(checknum);
	
		return str;
	}
	
	public static void main(String[] args) {
		Practice2_3 t = new Practice2_3();	
		System.out.println(t.idCardProduce());

	}
	
}
