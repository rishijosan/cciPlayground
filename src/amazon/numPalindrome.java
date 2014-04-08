package amazon;

import java.util.HashMap;
import java.util.Map.Entry;

public class numPalindrome {
	
	public static boolean isPal(String numStr)
	{
		
		int begInd = 0;
		int endInd = numStr.length()-1;
		
		while(begInd<endInd)
		{
			
			if(numStr.charAt(begInd) != numStr.charAt(endInd))
			{
				begInd +=1;
				endInd -=1;
				return false;
			}
			begInd +=1;
			endInd -=1;
			
		}
		
		return true;
		
	}
	
	
	public static String makePal(String str)
	{
		StringBuilder pal = new StringBuilder();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i =0;i<str.length();i++)
		{
			Integer j = hm.get(str.charAt(i));
			if (j !=null)
			{
				hm.put(str.charAt(i), j+1);
			}
			else
				hm.put(str.charAt(i), 1);
				
		}
		
		System.out.println(hm.toString());
		
		
		for (Entry<Character, Integer> entry : hm.entrySet())
		{
			int k = entry.getValue();
			if(k%2 != 0)
				hm.put(entry.getKey(), k+1);
			
			int times = entry.getValue()/2;
			hm.put(entry.getKey(), times);
			
			for(int ti = 0; ti<times;ti++)
			{
				pal = pal.append(entry.getKey());
			}
		}
		
		//System.out.println(pal);
		//System.out.println(pal.reverse());
		//pal.append(pal.reverse());
	
		StringBuilder rev = new StringBuilder(pal);
		rev.reverse();
		pal.append(rev);
		
		return pal.toString();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234521;
		
		String numStr = Integer.toString(num);
		String test = "thisisnotapalindrome";
		
		//System.out.println(isPal(numStr));
		
		System.out.println(makePal(test));
		

	}

}
