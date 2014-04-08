package random;

public class ReverseLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node asd = new Node(1);
		LinkedList ll = new LinkedList(1);
		
		for(int i = 2 ; i<11 ; i++)
		ll.insert(i);
		
		ll.print();
		
		System.out.println("!!!!!!");
		
		Node first = ll.first;
		//System.out.println(first.next.data);
		Node prev = null;
		Node curr = first;
		Node next;
		
		
		while (curr!=null)
		{		
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
	
		}
		
		ll.first = prev;
		
		ll.print();
	}

}
