package scalability;

public class Static {
	
	
	
	public static int a;
	public static int b;
	
	static{
		
		a = 20;
		b = 10;
			
	}
	
	public Static(int p , int q)
	{
		
		a = p;
		b = q;
	}

}

class test{
	
	public static void main(String[] args) {
	
	System.out.println(Static.a);
	System.out.println(Static.b);
	
	Static st = new Static(5,6);
	
	System.out.println(st.a);
	System.out.println(st.b);
	
	
	
	}
}
