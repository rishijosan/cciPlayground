package amazon;

public class subString {

	
	public static String str = "This is a new string!";
	
	  public  void display()
	  {
		  System.out.println(str);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		
		 
		 
		 System.out.println(str.substring(0, 4));
		 
		  String[] strs = str.split(" ");
		  
		  
		  for(int i = 0; i<strs.length;i++)
		  System.out.println(strs[i]);
		  


	}

}



