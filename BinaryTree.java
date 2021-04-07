//Can you write a function to traverse a binary tree in-order, and print out the value of each node as it passes?

/*********** INORDER TRAVERSAL ************/


class Node{
	int data;
	Node left,right;
	
	public Node(int value)
	{
		data = value;
		left=right=null;
	}
}

public class BinaryTree{
	Node root;
	
	public BinaryTree()
	{
		root=null;
	}
	
	public BinaryTree(int data)
	{
		root=new Node(data);
	}
	
    static void  printInorder(Node node)
	{
		if(node==null)
			return;
		
		printInorder(node.left);
		
		System.out.println(node.data + " ");
		
		printInorder(node.right);
		
	}
	
	public void printInorder()
	{
		printInorder(root);
	}
	
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.printInorder();
	}
	
	
}
