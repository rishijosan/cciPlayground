package recursion;

public class StepsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
				
		int n = 10;
		
		System.out.println(count(n,a));
		System.out.println(countWays(n));

	}
	
	
	public static int count(int n, int a)
	
	{
		
		if (n >= 3)
			a = count(n-3, a);
		if (n >= 2)
			a = count(n-2, a);
		if (n >= 1)
			a = count(n-1, a);
		
		if (n==0)
			a = a+1;
		
		
		return a;
		
	}
	
	
	public static int countWays(int n)
	
	{
		if (n<0)
			return 0;
		else if (n==0)
			return 1;
		else
			return countWays(n-1) + countWays(n-2) + countWays(n-3);

		
	}

}
