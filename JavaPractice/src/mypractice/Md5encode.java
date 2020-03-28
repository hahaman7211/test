package mypractice;

import java.security.MessageDigest;
import java.util.Scanner;

public class Md5encode {
	
	//test
	public static void main(String[] args) {
		
		char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		Scanner kb = new Scanner(System.in);
		System.out.print("enter a password: ");
		String password = kb.nextLine();

		try  {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] before = password.getBytes();
			
			/*System.out.println("before digesting: " + before.length);
			for(byte b:before) {
				System.out.print(b + " ");
			}		*/
			System.out.println();
			
			byte[] after = md.digest(before);	
			System.out.println("after digesting: " + after.length);
			for(byte b:after) {
				System.out.print(b + " ");
			}
			System.out.println();
			
			//way 1
			StringBuffer sb = new StringBuffer();
			for(byte b:after) {
				sb.append(String.format("%x", b>>4 & 0x0f) ); 
				sb.append(String.format("%x", b & 0x0f) );		
			}	
			System.out.println("way 1: " + sb);
			System.out.println("size 1: " + sb.length());
			
			//way2 --> the result may be different sometimes 
			System.out.println("-------------");
			StringBuffer sb2 = new StringBuffer();
			
			for(byte b:after) {
				sb2.append(String.format("%x", b));
			}
			System.out.println("way 2: " + sb2);	
			System.out.println("size 2: " + sb2.length());
			//System.out.print(String.format("%x", b));
			//System.out.print(String.format("%x", b>>4 & 0x0f));
			//System.out.print(String.format("%x", b & 0x0f));
			
			//way 3 
			System.out.println("-------------");
			StringBuffer sb3 = new StringBuffer();
			for(Byte b:after) {
				sb3.append(hexDigits[(b >> 4) & 0x0f]);
                sb3.append(hexDigits[b & 0x0f]); 
			}
			System.out.println("way 3: " + sb3);
			System.out.println("size 3: " + sb3.length());
			
			
			//test 0 digit
			System.out.println("-------------");
			// for 0-9, it needs to convert twice to get two hexadecimal
			System.out.println(String.format("%x", 0));
			System.out.println(String.format("%x", 0>>4 & 0x0f));
			System.out.println(String.format("%x", 0 & 0x0f));
			
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	
	}
	

}
