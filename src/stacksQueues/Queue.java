package stacksQueues;


public class Queue {

	Node first, last;
	
	public void enque(Object obj)
	{
		if (first == null)
		{
			first = new Node(obj);
			first.next = last;
		}
		else
		{
			last.next = new Node(obj);
			last = last.next;
			
		}
	}
	
	public Object deque()
	{
		if (first != null)
		{
			Node n = first;
			first = first.next;
			return n.data;
		}
		return null;
	}
}
