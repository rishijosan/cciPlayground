package oop;

public class AbsInh extends Abstr {

	public AbsInh(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbsInh ab = new AbsInh(33,44);
		
		ab.getX();
		ab.getY();
	}

	@Override
	public void getX() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}

}
