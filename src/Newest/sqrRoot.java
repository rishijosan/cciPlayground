package Newest;

public class sqrRoot {

	/**
	 * @param args
	 */
	
	//http://en.wikipedia.org/wiki/Newton's_method#Square_root_of_a_number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 172;
		float x = 1;
		
		//for (int i = 1 ; i < 1000000 ; i++ )
		while (Math.abs(x*x - n) > 0.0001)
		{
			//While Math.abs(x*x - n) > 0.00001
			x = (x+(n/x))/2;
			
		}
		
		System.out.println(x);
		char ch = 'd';
		int i = ch;
				
		System.out.println(i);
	}

}
