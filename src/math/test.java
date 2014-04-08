package math;

public class test {

	/**
	 * @param args
	 */
	
	public static int negate(int a)
	{
		int neg = 0;
		int d =0;
		
		if (a > 0)
		d = -1;
		else
			d= 1;
		
		while (a != 0)
		{
			neg = neg + d;
			a = a+ d;
			
		}
		
		return neg;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 1023;
		System.out.println(negate(a));

	}

}
