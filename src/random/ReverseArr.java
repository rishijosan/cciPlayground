package random;

public class ReverseArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		int head = 0 ;
		int tail = arr.length  - 1;
		
		
		
		while (!(head>tail))
		{
			int temp = arr[head];
			arr[head] = arr[tail];
			arr[tail] = temp;
			
			head++;
			tail--;
		}
		
		for (int i = 0 ; i< arr.length ; i++)
		System.out.println(arr[i]);
		
	}

}
