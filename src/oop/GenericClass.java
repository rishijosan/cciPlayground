package oop;

public class GenericClass<T> {

	/**
	 * @param args
	 */
	
	private  T t;
	
	public  void add(T t)
	{
		this.t = t;
	}
	
	public T get()
	{
		return t;
	}

	public static void main(String[] args) {
		
	
		GenericClass<Integer> gc = new GenericClass<Integer>();
		GenericClass<String> sgc = new GenericClass<String>();
		
		gc.add(20);
		sgc.add("This is a Test");
		
		System.out.println(gc.get());
		System.out.println(sgc.get());
		
		
	}

}
