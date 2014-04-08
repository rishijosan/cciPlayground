package random;

import java.util.HashSet;

public class ReveseString {
	
	public static HashSet<String> hs = new HashSet<String>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		String str = "Hello World!";
		StringBuffer sb = new StringBuffer(str.length());
		System.out.println(str.charAt(0));
		
		for (int i = str.length()-1; i>-1; i--)
		{
			//System.out.println(str.charAt(i));
			sb.append(str.charAt(i));
			//sb.append(str.charAt(i));
			
		}
		
		System.out.println(sb);
	}

}
