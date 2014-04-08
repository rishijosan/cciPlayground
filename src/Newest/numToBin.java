package Newest;

public class numToBin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 92;
		
		int n = num;
		
		int div = 0;
		int rem;
		
		String bin = "";
		
		while (n!=1)
		{
			div = n/2;
			rem = n%2;
			
			n = div;
			
			bin = rem + bin;
			
		}

		bin = Integer.toBinaryString(div) + bin;
		
		System.out.println(bin);
	}

}
