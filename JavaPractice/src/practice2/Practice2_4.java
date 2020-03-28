package practice2;

import java.util.Random;
import java.util.TreeSet;

public class Practice2_4 {

	public static void main(String[] args) {
		Practice2_4 lottery = new Practice2_4();
		TreeSet<String> myTree = lottery.playLottoSet();
		System.out.println(myTree);
	}

	public TreeSet<String> playLottoSet() {
		Random rd = new Random();
		TreeSet<String> mySet = new TreeSet<String>();
		int temp = 0;

		while (mySet.size() <= 6) {
			temp = rd.nextInt(49) + 1;
			String strNum = String.format("%02d", temp);
			mySet.add(strNum);
		}
		return mySet;

	}
}
