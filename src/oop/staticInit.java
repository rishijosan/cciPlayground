package oop;

public class staticInit {

	static int i;
	/**
	 * @param args
	 */
	
	static
	{
		i = 20;
		System.out.println(i);
	}
	
	staticInit()
	{
		i = 30;
		System.out.println(i);
	}
	
	
	public static void print()
	{
		System.out.println(i);
	}


}

class test
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a = staticInit.i;
		
		//staticInit sts = new staticInit();
		
		staticInit.print();
		
		

	}	

}