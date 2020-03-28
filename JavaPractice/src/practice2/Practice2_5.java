package practice2;


import java.util.ArrayList;



public class Practice2_5 {
	
	public ArrayList<String> playLottoList(String[] lotto) {
		//List<String> myAL = Arrays.asList(lotto);	
		ArrayList<String> myAL = new ArrayList<String>();
		for(int i=0; i<lotto.length; i++) {
			myAL.add(lotto[i]);
		}
		return myAL;
	}
	
	public static void main(String[] args) {
		Practice2_1 lottery = new Practice2_1();
		String[] str = lottery.playLotto();
		Practice2_5 p = new Practice2_5();
		System.out.print(p.playLottoList(str));	
	}

}
