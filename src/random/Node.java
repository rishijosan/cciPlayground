package random;

	public class Node {

		Node next = null;
		int data;
		
		
		public Node(int d)
		{
			data = d;
		}
		

		
		public void print()
		{
			System.out.println(data);
		}

	}

	
	class LinkedList{
		
		Node first;
		
		public LinkedList()
		{
			first=null;
		}
		
		public LinkedList(int d)
		{
			first= new Node(d);
		}
		
		public void insert(int d)
		{
			
			if (first != null)
			{
				Node curr = first;			
				
				while(curr.next!=null)
				{
					curr = curr.next;
				}
				
				curr.next = new Node(d);
			}
			else
				first = new Node(d);
			
		}
		
			public void print()
			{
				Node curr = first;
				while (curr!=null)
				{
					System.out.println(curr.data);
					curr=curr.next;
				}
			}
				
		
	}