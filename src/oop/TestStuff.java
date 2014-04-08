package oop;

public class TestStuff implements TestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestStuff ts = new TestStuff();
		ts.getInt();

	}

	@Override
	public void getInt() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}

	@Override
	public void setInt(int y) {
		// TODO Auto-generated method stub
		//x = y;
	}

}
