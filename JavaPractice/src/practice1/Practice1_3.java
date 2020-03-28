package practice1;

import java.util.*;

public class Practice1_3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		ArrayList<Integer> myAL = new ArrayList<Integer>();

		int temp = 0;
		for (int i = 0; i < 4; i++) {
			temp = rd.nextInt(10);
			while (myAL.contains(temp)) {
				temp = rd.nextInt(10);
			}
			myAL.add(temp);
		}

		System.out.print(myAL.get(0));
		System.out.print(myAL.get(1));
		System.out.print(myAL.get(2));
		System.out.print(myAL.get(3));

		System.out.print("\nenter the number: ");
		int guest = kb.nextInt();

		int A = 0;
		int B = 0;
		int k = 4;
		while (A != 4) {
			A = 0;
			B = 0;
			k = 4;
			while (guest > 0) {
				k--;
				int n = guest % 10;
				if (n == myAL.get(k))
					A++;
				else if (myAL.contains(n))
					B++;
				guest = guest / 10;
			}
			System.out.println(A + "A" + B + "B");
			if (A != 4) {
				System.out.print("enter four number: ");
				guest = kb.nextInt();
			}
		}
		
		kb.close();

	}

}
