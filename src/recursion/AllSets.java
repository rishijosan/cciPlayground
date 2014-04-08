package recursion;
import java.util.*;

public class AllSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 1; i <= 5; i++)
			set.add(i);
		
		int len = set.size();
		
		int bin = 1 << len;
		
		System.out.println(Integer.toBinaryString(bin));
		
		String binary = Integer.toBinaryString(bin);
		

		//set.toArray().l;
		
		
		

	}

}
