package tree_speedrun;

public class Balance_Check {
	static int sum=0;
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.right = new Node(8);
		root.right.left = new Node(3);
		root.right.right = new Node(7);
		root.left.right.left=new Node(88);
		System.out.println(check(root));
	}
	static int check(Node root)
	{
		if(root==null)
			return 0;
		else
		{
			int left = check(root.left);
			if(left==-1)
				return -1;
			int right = check(root.right);
			if(right==-1)
				return -1;
			if(Math.abs(left-right)>1)
				return -1;
			return Math.max(left, right)+1;
		}
	}

}
