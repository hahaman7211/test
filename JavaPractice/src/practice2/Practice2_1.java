package practice2;

import java.util.Random;
import java.util.TreeSet;

public class Practice2_1 {
	public static void main(String[] args) {
		Practice2_1 lottery = new Practice2_1();
		String[] str = lottery.playLotto();
		for (String temp : str)
			System.out.print(temp + " ");

	}

	public String[] playLotto() {
		String[] lottery = new String[6];
		Random rd = new Random();
		TreeSet<Integer> mySet = new TreeSet<Integer>();
		int temp = 0;

		for (int i = 0; i < lottery.length; i++) {
			temp = rd.nextInt(49) + 1;
			while (mySet.contains(temp)) {
				temp = rd.nextInt(49) + 1;
			}
			mySet.add(temp);
		}

		for (int i = 0; i < 6; i++) {
			String strNum = String.format("%02d", mySet.pollFirst());
			lottery[i] = strNum;
		}
		return lottery;

	}

}
