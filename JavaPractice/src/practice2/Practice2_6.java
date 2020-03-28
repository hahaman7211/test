package practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Practice2_6 {
	
	public HashMap<Integer, String> playLottoMap(TreeSet<String> lotto) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Iterator<String> ar = lotto.iterator();
		int count = 1;
		
		while(ar.hasNext())	{
			map.put(count, ar.next());
			count++;
		}	
		return map;
		
	}
	
	public static void main(String[] args) {
		Practice2_4 p4 = new Practice2_4();
		Practice2_6 p6 = new Practice2_6();
		
		TreeSet<String> myTree = p4.playLottoSet();
		HashMap<Integer, String> map = p6.playLottoMap(myTree);
		System.out.print(map);
		
	}

}
