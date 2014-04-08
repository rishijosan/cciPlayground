package amazon;

import java.util.HashSet;

public class OddNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[] arr = {1,1,2,3,4,5,6,6,7};
			
			
			HashSet<Integer> hs = new HashSet<Integer>();
			
			
			for (int item : arr)
			{
				if(hs.contains(item))
					hs.remove(item);
				else
					hs.add(item);
			
			}
			
			System.out.println(hs.toString());
	}

}
