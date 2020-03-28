package practice1;

import java.util.Scanner;

public class Practice1_4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		StringBuilder star = new StringBuilder();

		System.out.print("enter a number: ");
		int n = kb.nextInt();

		// 4-1
//		for (int i = 0; i < n; i++)
//			star.append("");

		for (int i = 0; i < n; i++) {
			star.replace(i, i + 1, "*");
			System.out.println(star);
		}
		// 4-2
		System.out.println("----------------");
		star = new StringBuilder();

		for (int i = 0; i < n; i++)
			star.append(" ");

		for (int i = 0; i < n; i++) {
			star.replace(n - i - 1, n - i, "*");
			System.out.println(star);
		}
		// 4-3
		System.out.println("----------------");

		star = new StringBuilder();
		for (int i = 0; i < n; i++)
			star.append("*");
		for (int i = 0; i < n; i++) {
			star.replace(n - i, n - i + 1, "");
			System.out.println(star);
		}
		// 4-4
		System.out.println("----------------");
		for (int i = n; i > 0; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 4-5
		System.out.println("----------------");
		star = new StringBuilder();
		for (int i = 0; i < n; i++)
			star.append(" ");

		for (int i = 0; i < n; i++) {
			star.replace(n - i - 1, n - i, "* ");
			System.out.println(star);

		}
		// 4-6
		System.out.println("----------------");
		star = new StringBuilder();
		for (int i = 0; i < n; i++)
			star.append(" ");
		for (int i = 0; i < n; i++) {
			star.replace(n - i - 1, n - i, "* ");
			System.out.println(star);
		}
		for (int i = 0; i < n; i++) {
			star.replace(i, i + 1, "");
			System.out.println(star);
		}
		
		kb.close();

	}

}
