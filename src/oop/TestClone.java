package oop;

public class TestClone {

	public int x;
	public int y;
	
	public TestClone(int x, int y)
	{
		
		this.x = x;
		this.y = y;
		
	}
	
	public TestClone(){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClone ts = new TestClone(12,13);
		
		TestClone ts1 = new TestClone();
		
		ts1 = ts;
		
		ts1.x = 15;
		
		System.out.println(ts.x);
		
		
	}

}
