package stacksQueues;


public class Stack {
	
	Node top;
	
	public Object pop()
	{
		if (top != null)
		{
			Object ret = top.data;
			top = top.next;
			return ret;
			
		}
		
		return null;
	}

	
	public void push(Object obj)
	{
		Node n = new Node(obj);
		n.next = top;
		top = n;
		
	}
	
	public Object peek()
	{
		if (top != null)
			return top.data;
		
		return null;
	}
	
}
