package practice1;

import java.util.Random;

public class Practice1_2 {

	public static void main(String[] args) {
		int A = 0; // 100-90
		int B = 0; // 80-89
		int C = 0; // 70-79
		int D = 0; // 60-69
		int E = 0; // <60

		Random rd = new Random();

		int[] score = new int[20];

		for (int i = 0; i < 20; i++) {
			score[i] = rd.nextInt(101);
			// System.out.println(score[i]);
			if (score[i] > 89) {
				A++;
			} else if (score[i] > 79)
				B++;
			else if (score[i] > 69)
				C++;
			else if (score[i] > 59)
				D++;
			else
				E++;

		}

		System.out.println("100-90: " + A);
		System.out.println("89-80: " + B);
		System.out.println("79-70: " + C);
		System.out.println("69-60: " + D);
		System.out.println("<60: " + E);

	}

}
