class Node{
	int data;
	Node left;
	Node right;
	Node (int k)
	{
		data=k;
	}
}

public class Treess {
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.right = new Node(8);
		root.right.left = new Node(3);
		root.right.right = new Node(7);
		level(root,0);
	}
	static void level(Node root, int k)
	{
		if(root!=null)
		{
			if(k==0)
			{
				System.out.print(root.data+" ");
			}
			else
			{
				level(root.left,k-1);
				level(root.right,k-1);
			}
		}
	}
	
}
