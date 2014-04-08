package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ZeroSumArr {

	/**
	 * @param args
	 */
	public int ind1;
	public int ind2;
	
	public ZeroSumArr(int i1, int i2)
	{
		ind1 = i1;
		ind2 = i2;
	}
	
	
	public String toString()
	{
		return ind1 + ", " + ind2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,6,3,-9,-5,1,3,0,2};
		
		
		int[] tmp = new int[arr.length];
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>(arr.length);
		ArrayList<ZeroSumArr> list = new ArrayList<ZeroSumArr>();
		
		tmp[0] = arr[0];
		hs.put(tmp[0], 0);	
		
		for (int i=1;i<arr.length;i++)
		{
			
			if(hs.containsKey(tmp[i]))
			{
				list.add(new ZeroSumArr(hs.get(tmp[i])+1,i));
			}
			else
			{
			tmp[i] = tmp[i-1] + arr[i];
			hs.put(tmp[i], i);	
			}
			
			if(tmp[i]==0)
				list.add(new ZeroSumArr(0,i));
			

		}
		
		
		System.out.println(list.toString());
		
		

	}

}
