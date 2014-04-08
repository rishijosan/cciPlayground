package commVault;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeNode {

private char data;
public char getData() {
    return data;
}
public void setData(char data) {
    this.data = data;
}
public BinaryTreeNode getLeft() {
    return left;
}
public void setLeft(BinaryTreeNode left) {
    this.left = left;
}
public BinaryTreeNode getRight() {
    return right;
}
public void setRight(BinaryTreeNode right) {
    this.right = right;
}
private BinaryTreeNode left;
private BinaryTreeNode right;

public static void levelTravesal(BinaryTreeNode node)
{
    Queue queue = new LinkedList();

    if(node == null)
        return;
    queue.offer(node);
    queue.offer(null);
    int level =0;
    while(!queue.isEmpty())
    {
        BinaryTreeNode temp = (BinaryTreeNode) queue.poll();

        if(temp == null)
        {
            System.out.println("Level: "+level);
            if(!queue.isEmpty())
                queue.offer(null);
            level++;
        }else {

        System.out.println(temp.data);

        if(temp.getLeft()!=null)
            queue.offer(temp.getLeft());

        if(temp.getRight()!=null)
            queue.offer(temp.getRight());
        }

    }
}

static int preIndex = 0;

public static void main(String[] args) {

	/*
    if(args.length < 2)
    {
        System.out.println("Usage: preorder inorder");
        return;
    }
    */

    //char[] preOrderSequence = args[0].toCharArray();
    //char[] inOrderSequence = args[1].toCharArray();
    
    char[] preOrderSequence = null;
    char[] inOrderSequence = null;
    
    Scanner sc = new Scanner(System.in);
    int n = 1;
    while(sc.hasNextLine())
    {
    	
    	if (n == 1)
    	{
    		preOrderSequence = sc.nextLine().toCharArray();
    		n++;
    	}
    	else if (n == 2)
    	{
    		inOrderSequence = sc.nextLine().toCharArray();
    		break;
    		
    	}
    	
    	
    }
    
    //char[] preOrderSequence = {'A','B','D','E','C','F'};
    //char[] inOrderSequence = "DBEAFC".toCharArray();

    if(preOrderSequence.length != inOrderSequence.length)
    {
        System.out.println("Pre-order and in-order sequences must be of same length");
        return;
    }

    BinaryTreeNode root = buildBinaryTree(preOrderSequence, inOrderSequence, 0, preOrderSequence.length-1);

    System.out.println();
    levelTravesal(root);


}

static BinaryTreeNode buildBinaryTree(char[] preOrder, char[] inOrder, int start, int end)
{
    if(start > end)
        return null;
    BinaryTreeNode rootNode = new BinaryTreeNode();
    rootNode.setData(preOrder[preIndex]);
    preIndex++;
    //System.out.println(rootNode.getData());
    if(start == end)
        return rootNode;
    int dataIndex = search(inOrder, start, end, rootNode.getData());
    if(dataIndex == -1)
        return null;
    //System.out.println("Left Bounds: "+start+" "+(dataIndex-1));
    rootNode.setLeft(buildBinaryTree(preOrder, inOrder, start, dataIndex - 1));
    //System.out.println("Right Bounds: "+(dataIndex+1)+" "+end);
    rootNode.setRight(buildBinaryTree(preOrder, inOrder, dataIndex+1, end));
    return rootNode;
}


static int search(char[] inOrder,int start,int end,char data)
{
    for(int i=start;i<=end;i++)
    {
        if(inOrder[i] == data)
            return i;
    }
    return -1;

}

}