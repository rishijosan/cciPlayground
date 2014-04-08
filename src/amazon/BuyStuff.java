package amazon;

public class BuyStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(buy(164));

	}
	
	
	
	public static boolean buy(int n)
	{

		
		if (n>=17)
			return buy(n-17);
		if (n>=11)
			return buy(n-11);
		if (n>=7)
			return buy(n-7);
		
		if(n==0)
			return true;
		else
			return false;
		
	}

}
