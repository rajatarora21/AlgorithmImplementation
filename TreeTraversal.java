

public class TreeTraversal 
{
	class Node
	{
		int value;
		Node left,right;
		
		public Node(int value)
		{
			this.value=value;
			left=null;
			right=null;
		}
		
	}
	Node root;
	
	public TreeTraversal()
	{
		root = null;
	}
	
	void printPostorder()
	{
		
	}
	void printPreorder()
	{
		
	}
	void printInorder(Node node)
	{
		if(node == null)
			return;
		
		printInorder(node.left);
		System.out.println(node.value);
		printInorder(node.right);
	}
	void insert(int value)
	{
		root = insertValue(root,value);
	}
	Node insertValue(Node root,int value)
	{
		if(root == null)
		{
			root = new Node(value);
			return root;
		}
		else
		{
			if(value<root.value)
				root.left=insertValue(root.left,value);
			else if(value>root.value)
				root.right=insertValue(root.right,value);
			return root;
		}
	}
	
	public static void main(String[] args)
	{
		TreeTraversal t=new TreeTraversal();
		t.insert(1);
		t.insert(4);
		t.insert(3);
		t.insert(10);
		t.insert(20);
		
	}
	
	
	
}
