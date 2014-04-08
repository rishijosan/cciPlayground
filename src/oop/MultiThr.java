package oop;

public class MultiThr implements Runnable {
	
	public  int x;
	
	//public char y =  Character.toChars(x);
	
	public MultiThr(int x)
	{
		this.x = x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1 ; i< 100; i++)
		{
		Thread td = new Thread(new MultiThr(i));
		td.start();
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(x);
		
	}

}
