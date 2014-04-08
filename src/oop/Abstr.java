package oop;

public abstract class Abstr {
	
	int x,y=10;
	
	public Abstr(int x, int y)
	{
		
		this.x = x;
		this.y = y;
	}
	
	public abstract void  getX();
	
	public void getY()
	{
		System.out.println(y);
	}

	
}
