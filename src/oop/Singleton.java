package oop;

public class Singleton {

private static Singleton singInst = null;
protected Singleton(){}

public static Singleton getInstance()


{
	if (singInst == null)
			{
				singInst = new Singleton();
				return singInst;
			}
	
	else
		return singInst;
}

}

