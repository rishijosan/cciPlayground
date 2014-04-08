package amazon;

public class MatrixRot {

	/**
	 * @param args
	 */
	
	static int[][] arrayOrg = {{1,2,3},{4,5,6},{7,8,9}, {1,1,1}};
	
	public static void print(int[][] arr)
	{
		System.out.println();
	 for (int i=0; i<arr.length; i++)
	  { for (int j=0;j<arr[0].length;j++) {
	    System.out.print( arr[i][j]+" ");
	  } 
	  System.out.println();
	  }
	}
	
	
	public static int[][] transpose(int array[][])
	{
		int[][] newArr = new int[array[0].length][array.length];
		
		for (int i=0; i<array.length; i++)
		  { 
			for (int j=0;j<array[0].length;j++) 
				{
					newArr[j][i] = array[i][j];
				} 
		  }
		
		return newArr;
	}
	
	
	public static int[][] revRow(int[][] arr)
	{
		int[][] newArr = new int[arr.length][arr[0].length];
		
		for (int i =0 ; i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				//int temp = arr[i][j];
				newArr[i][j] = arr[arrayOrg[0].length-i-1][j];
				//newArr[arrayOrg[0].length-i-1][j] = temp;
			}
		}
		
		
		return newArr;
		
	}
	
	
	
	public static int[][] revCol(int[][] arr)
	{
		int[][] newArr = new int[arr.length][arr[0].length];
		
		for (int i =0 ; i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				newArr[i][j] = arr[i][arr[0].length-j-1];
			}
		}
		
		
		return newArr;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Rows: " + arrayOrg.length);
		System.out.println("Cols: " + arrayOrg[0].length);
		
		
		print(arrayOrg);
		//print(transpose());
		print(transpose(arrayOrg));
		print(revRow(transpose(arrayOrg)));
		print(revCol(transpose(arrayOrg)));
		
		//print(revCol(transpose(arrayOrg)));

	}

}
