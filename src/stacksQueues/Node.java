package stacksQueues;

public class Node {

	Node next = null;
	Object data;
	
	
	public Node(Object d)
	{
		data = d;
	}
	
	public void append(Object item)
	{
		Node last = new Node(item);
		Node n = this;
		
		while (n.next != null)
		{
			n = n.next;	
		}
		
		n.next = last;
	}

}
