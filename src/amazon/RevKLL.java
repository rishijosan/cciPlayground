package amazon;

public class RevKLL {

	/**
	 * @param args
	 */
	
	static Node a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a = new Node(1);
		Node curr = a;
		
		for(int i =2; i<=10; i++)
		{
		curr.next = new Node(i);
		curr = curr.next;
		}
		
		
		curr = a;
		
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
		
		
		revSub(5,a);
		curr = a;
		
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	
	public static void revSub(int num, Node first)
	{
		
		
				
		Node entry=first;
		Node curr = entry;
		
		while(num>1)
		{
		int i = 0;
		while(i<num)
		{	
			curr = curr.next;
			i=i+1;
		}
		
		int temp = entry.data;
		entry.data = curr.data;
		curr.data = temp;
		
		num = num-2;
		entry = entry.next;
		
		}
		
	}
	
	
	
	public static Node revSubList(int num, Node first)
	{
		Node curr =first;
		Node prev = null;
		
		int n = 1;
		
		while (n<=num)
		{
			
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			n=n+1;
			
		}
		
		return curr;
		
		
	}

}
