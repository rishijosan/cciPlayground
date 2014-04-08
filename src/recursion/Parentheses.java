package recursion;

import java.util.ArrayList;

public class Parentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(printPar(4));

	}
	public static ArrayList<String> printPar(int n)
	{
		ArrayList<String> pars = new ArrayList<String>();
		if (n==0)
		{
			pars.add("");
			return pars;
		}
		else if (n==1)
		{
			pars.add("()");
			return pars;
		}
			
		else return addPar(printPar(n-1));	
	}
	
	public static ArrayList<String> addPar(ArrayList<String> strings)
	{
		ArrayList<String> res = new ArrayList<String>();
		
		for (int i =0;i<strings.size();i++)
		{
			String temp = strings.get(i);					
			for(int j = 0 ; j<temp.length(); j++)
			{
				if (temp.charAt(j) == '(' )
				{
					String newStr = temp.substring(0, j+1) + "()" + temp.substring(j+1, temp.length());
					res.add(newStr);
				}
			}		
			res.add("()" + temp );
		}
		return res;
	}
}
