
public class BinarySearchTree {

	
	class Node
	{
		int value;
		Node left,right;
		
		public Node(int value)
		{
			this.value=value;
			this.left=null;
			this.right=null;
		}
	}
	
	Node root;
	
	public BinarySearchTree()
	{
		root=null;
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
	void inorder()
	{
		inorderTraverse(root);
	}
	void inorderTraverse(Node root)
	{
		if(root!=null)
		{
			inorderTraverse(root.left);
			System.out.println(root.value);
			inorderTraverse(root.right);
		}
	}
	public static void main(String[] args) 
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(10);
		bst.insert(0);
		bst.insert(1);
		bst.insert(20);
		bst.insert(30);
		bst.insert(5);
		bst.inorder();
	}

}
