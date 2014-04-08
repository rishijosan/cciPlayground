package amazon;

public class Inr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String rs = "11200234"; // 1,12,00,234
		String out = "";
		int div = 10000;
		
		int mon = Integer.parseInt(rs);
		
		
		int rem = mon % 1000; //234
		int res = mon / 1000; // 11200
		
		//out = out + "," + rem ;
		
		String resStr = Integer.toString(res);	
		String resStrRev = new StringBuilder(resStr).reverse().toString();
		
		System.out.println(resStrRev);
		String finalStr = "";
		
		int j = 0;
		
		for(int i = 2	; i<resStrRev.length(); i=i+2)
		{
			finalStr = finalStr + "," + resStrRev.substring(j,i);
			j = j+2;
			
		}
		
		System.out.println(finalStr);
		
	}

}
