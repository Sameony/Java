package tree_speedrun;

public class Nodes_in_CompleteBintree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		root.right.right.left = new Node(14);
		//root.right.right.right = new Node(15);
		System.out.println(Countc(root));
		
	}
	static int Countc(Node root)
	{
		if(root==null)
			return 0;
		int lh=0;
		Node curr=root;
		while(curr!=null)
		{
			lh++;
			curr=curr.left;
		}
		int rh=0;
		curr=root;
		while(curr!=null)
		{
			rh++;
			curr=curr.right;
		}
		if(lh==rh)
			return (int)(Math.pow(2,rh)-1);
		else
		{
			return (1+Countc(root.left)+Countc(root.right));
		}
			
	}
	

}
