package treesGraphs;

import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

	Node root;
	static int sumGreat = 0;

	public void addNode(int key, String name) {

		// Create a new Node and initialize it

		Node newNode = new Node(key, name);

		// If there is no root this becomes root

		if (root == null) {

			root = newNode;

		} else {

			// Set root as the Node we will start
			// with as we traverse the tree

			Node focusNode = root;

			// Future parent for our new Node

			Node parent;

			while (true) {

				// root is the top parent so we start
				// there

				parent = focusNode;

				// Check if the new node should go on
				// the left side of the parent node

				if (key < focusNode.key) {

					// Switch focus to the left child

					focusNode = focusNode.leftChild;

					// If the left child has no children

					if (focusNode == null) {

						// then place the new node on the left of it

						parent.leftChild = newNode;
						return; // All Done

					}

				} else { // If we get here put the node on the right

					focusNode = focusNode.rightChild;

					// If the right child has no children

					if (focusNode == null) {

						// then place the new node on the right of it

						parent.rightChild = newNode;
						return; // All Done

					}

				}

			}
		}

	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			// Traverse the left node

			inOrderTraverseTree(focusNode.leftChild);

			// Visit the currently focused on node

			System.out.println(focusNode);

			// Traverse the right node

			inOrderTraverseTree(focusNode.rightChild);

		}

	
	}
	
	
	public Node findNode(int key) {

		// Start at the top of the tree

		Node focusNode = root;

		// While we haven't found the Node
		// keep looking

		while (focusNode.key != key) {

			// If we should search to the left

			if (key < focusNode.key) {

				// Shift the focus Node to the left child

				focusNode = focusNode.leftChild;

			} else {

				// Shift the focus Node to the right child

				focusNode = focusNode.rightChild;

			}

			// The node wasn't found

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}
	
	
	public void inOrder(Node focusNode) {
		
		Stack<Node> elem = new Stack<Node>();
		Node current;
		
		current = focusNode;
		
		
		
		while (true)
			
		{
			if (current!= null)
			{
			elem.push(current);
			current = current.leftChild;
			}
		
			else{
		if (!elem.empty())
		{
			current = elem.pop();
			System.out.println(current);
			
			current = current.rightChild;
		}
		else
			return;
			}
		}
	}
	

	public void preorderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);

			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);

		}

	}
	
	
	
	//Wrong
	public void preIter(Node focusNode)
	{
		
		Stack<Node> stk = new Stack<Node>();
		stk.push(null);
		
		Node curr = focusNode;
		
		while (curr!=null)
		{
			System.out.println(curr);
			if (curr.rightChild!=null)
				stk.push(curr.rightChild);
			if (curr.leftChild!=null)
				curr = curr.leftChild;
			else
				curr = stk.pop();
			
			
		}
		
		
	}
	
	
	public void postIter(Node focusNode)
	{
		
		
		
		//http://en.wikipedia.org/wiki/Tree_traversal#Pre-order_2
	}
	

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);

		}

	}
	
	public void bfs(Node focusNode)
	{
		LinkedList<Node> ll = new LinkedList<Node>();
		ll.add(focusNode);
		
		while (!ll.isEmpty())
		{
			Node current = ll.pop();
			System.out.println(current);
			
			if (current.leftChild!=null)
			ll.add(current.leftChild);
			if (current.rightChild!=null)
			ll.add(current.rightChild);
		}
		
	}
	
	
	public int heightRecur(Node focusNode)
	{
		
		if (focusNode!=null)
			return Math.max(heightRecur(focusNode.leftChild),heightRecur(focusNode.rightChild)) + 1;
		else
			return 0;
	}
	
	
	public int heightIter(Node focusNode)
	
	{
		
	LinkedList<Node> ll = new LinkedList<Node>();
	ll.add(focusNode);
	
	int height = 0;
	int nodeCount = 0;
	
	while(true)
	{
		
		nodeCount = ll.size();
		
		if (nodeCount==0)
			return height;
		else
			height++;
		
		while(nodeCount>0)
		{
			Node curr = ll.pop();
			if (curr.leftChild!=null)
				ll.add(curr.leftChild);
			if (curr.rightChild!=null)
				ll.add(curr.rightChild);
			
			nodeCount--;
			
		}
			
		
	}
	
	//return height;
	
	}
	
	
	public void bfsLl(Node focusNode)
	{
		LinkedList<Node> ll = new LinkedList<Node>();
		ll.add(focusNode);
		
		while (!ll.isEmpty())
		{	
			System.out.println(ll);
			Node current = ll.pop();
			//System.out.println(current);
			
			if (current.leftChild!=null)
			ll.add(current.leftChild);
			if (current.rightChild!=null)
			ll.add(current.rightChild);
		}
		
	}
	
	public static Node createTree(int arr[], int start, int end)
	{
		if(start > end)
			return null;
		
		int mid = (start + end)/2;
				
				Node newNode = new Node(arr[mid], Integer.toString(mid));
				
				newNode.leftChild = createTree(arr, start, mid-1);
				newNode.rightChild = createTree(arr, mid+1, end);
		
		return  newNode;
	}
	
	
	public static boolean sumToLeaf(Node focusNode, int sum)
	
	{
		if (focusNode == null)
			return sum == 0;
		
		else{
		
		boolean ans = false	;
			
		int curSum = sum - focusNode.key;
		
		if (curSum == 0 && focusNode.leftChild == null && focusNode.rightChild == null)
			return true;
		
		if (focusNode.leftChild!=null)
			ans = ans || sumToLeaf(focusNode.leftChild, curSum);
		if (focusNode.rightChild!=null)
			ans = ans || sumToLeaf(focusNode.rightChild, curSum);
		
		return ans;
		
		}

	}
	
	public static void greaterNum(Node focusNode)
	{
		
		if(focusNode == null)
			return;
		
		greaterNum(focusNode.rightChild);
		
		sumGreat = sumGreat + focusNode.key;
		focusNode.key = sumGreat;
		
		greaterNum(focusNode.leftChild);
		
	}
	
	public static void mirror(Node focusNode)
	{
		if(focusNode == null)
			return;
		mirror(focusNode.leftChild);
		mirror(focusNode.rightChild);
		Node temp = focusNode.leftChild;
		focusNode.leftChild = focusNode.rightChild;
		focusNode.rightChild = temp;
		
		
	}
	
	static int visited = -1;
	
	public static void leftmostNodes(Node focusNode, int level)
	
	{
		if (focusNode!=null)
		{
			if (level>visited)
			{
				System.out.println(focusNode);
				visited = level;
			}
			
			leftmostNodes(focusNode.leftChild, level+1);
			leftmostNodes(focusNode.rightChild, level+1);
			
			
		}
		
	}

	
	
	public static boolean isPairPresent(int sum, Node focusNode)
	{
		boolean done1 = false, done2 = false;
		Node curr1 = focusNode, curr2= focusNode;
		int val1 = 0, val2 = 0;
		
		Stack<Node> st1 = new Stack<Node>();
		Stack<Node> st2 = new Stack<Node>();
		
		
		while(true)
		{
			
			while(!done1)
			{
				if (curr1!=null)
				{
					st1.push(curr1);
					curr1=curr1.leftChild;
				}
				else
				{
					if(st1.isEmpty())
						done1 = true;
					else
					{
						curr1 = st1.pop();
						val1 = curr1.key;
						curr1=curr1.rightChild;
						done1=true;
						
					}
				}
			}
			
			
			
			
			while(!done2)
			{
				if (curr2!=null)
				{
					st2.push(curr2);
					curr2=curr2.rightChild;
				}
				else
				{
					if(st2.isEmpty())
						done2 = true;
					else
					{
						curr2 = st2.pop();
						val2 = curr2.key;
						curr2=curr2.leftChild;
						done2=true;
						
					}
				}
			}
			
			
			if ( (val1!=val2) && (val1+val2==sum))
			{
				System.out.println("Found! :" + val1 + " , " + val2);
				return true;
			}
			else if(val1+val2<sum)
				done1=false;
			else if(val1+val2>sum)
				done2=false;
			
			
			if (val1>=val2)
				return false;
				
			
			
		}
		
		
	}
	

public static void main(String[] args) {

		BinaryTree theTree = new BinaryTree();

		theTree.addNode(50, "Boss");

		theTree.addNode(25, "Vice President");

		theTree.addNode(15, "Office Manager");

		theTree.addNode(30, "Secretary");

		theTree.addNode(75, "Sales Manager");

		theTree.addNode(85, "Salesman 1");

		// Different ways to traverse binary trees

		// theTree.inOrderTraverseTree(theTree.root);

		// theTree.preorderTraverseTree(theTree.root);

		// theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75

		System.out.println("\nNode with the key 75");

		System.out.println(theTree.findNode(75));

		System.out.println("____________________");
		theTree.inOrderTraverseTree(theTree.root);
		
		System.out.println("____________________");
		theTree.inOrder(theTree.root);
		
		System.out.println("BFS____________________");
		theTree.bfs(theTree.root);
			
		
		
		int[] arr = {1,2,6,7,8,11,13,15,18};
		
		Node test = createTree(arr, 0, arr.length-1);
		System.out.println("____________________");
		theTree.inOrder(test);
		
		System.out.println("____________________");
		theTree.bfsLl(theTree.root);
		
		
		System.out.println("____________________");
		theTree.preorderTraverseTree(theTree.root);
		theTree.preIter(theTree.root);
		
		
		System.out.println("____________________");
		System.out.println(theTree.heightRecur(theTree.root));
		System.out.println(theTree.heightIter(theTree.root));
		
		
		System.out.println("____________________");
		System.out.println(sumToLeaf(theTree.root, 210));
		
		System.out.println("____________________");
		//greaterNum(theTree.root);
		//mirror(theTree.root);
		theTree.bfs(theTree.root);
		
		
		System.out.println("____________________");
		leftmostNodes(theTree.root, 1);
		
		
		System.out.println("____________________");
		System.out.println(isPairPresent(100,theTree.root));
		
		
		
		
}
}

class Node {

	int key;
	String name;

	Node leftChild;
	Node rightChild;

	Node(int key, String name) {

		this.key = key;
		this.name = name;

	}

	public String toString() {

		return name + " has the key " + key;

		/*
		 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
		 * "\nRight Child: " + rightChild + "\n";
		 */

	}

}