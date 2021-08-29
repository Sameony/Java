package tree_speedrun;

public class BSTcheck {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(30);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.right.left = new Node(20);
		root.right.right = new Node(50);
//		root.left.left.left = new Node(80);
//		root.left.left.right = new Node(90);
//		root.left.right.left = new Node(100);
//		root.left.right.right = new Node(110);
//		root.right.left.left = new Node(120);
//		root.right.left.right = new Node(130);
//		root.right.right.left = new Node(140);
//		root.right.right.right = new Node(150);
		System.out.println(checkbst(root));
	}
	static boolean checkbst(Node root)
	{
		return(helper(root, Integer.MIN_VALUE,Integer.MAX_VALUE));
		
	}
	static boolean helper(Node root, int min, int max)
	{
		if(root==null)
			return true;
		else
		{
			return( root.data < max && root.data >min && helper(root.left, min, root.data) && helper(root.right, root.data, max));
		}
	}

}
