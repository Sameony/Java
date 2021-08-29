package tree_speedrun;
//import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node (int x)
	{
		data=x;
	}
}
public class Children_sum_Prop {

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(1);
		root.left.right = new Node(1);
		root.right.left = new Node(1);
		root.right.right = new Node(2);
//		root.left.left.left = new Node(8);
//		root.left.left.right = new Node(9);
//		root.left.right.left = new Node(10);
//		root.left.right.right = new Node(11);
//		root.right.left.left = new Node(12);
//		root.right.left.right = new Node(13);
//		root.right.right.left = new Node(14);
//		root.right.right.right = new Node(15);
		System.out.println(CSP(root));
	}
	static boolean CSP(Node root)
	{
		if(root==null)
			return true;
		if(root.left==null && root.right == null)
			return true;
		else
		{
			int sum=0;
			if(root.left!=null)
				sum+=root.left.data;
			if(root.right!=null)
				sum+=root.right.data;
			return sum==root.data && CSP(root.left)&& CSP(root.right); 
		}
	}

}
