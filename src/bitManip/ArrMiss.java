package bitManip;

import java.util.BitSet;

public class ArrMiss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[100];
		
		for (int i = 0 ; i<100 ; i++)
		{
			arr[i] = i;
		}
		
		
		arr[20] = 1;
		arr[45] = 2;
		arr[99] = 76;
		arr[23] = 77;
		
		
		
		BitSet bs = new BitSet(100);
		
		
		for (int i =0; i<100 ; i++)
		{
			
			bs.set(arr[i]);
		}

		
		for (int i =0; i<100 ; i++)
		{
			
			if(!bs.get(i))
				System.out.println(i);
		}
		
		
		
	}

}
