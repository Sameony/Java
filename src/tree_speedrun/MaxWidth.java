package tree_speedrun;

import java.util.*;

public class MaxWidth {

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(1);
		root.left.right = new Node(1);
		root.right.left = new Node(1);
		root.right.right = new Node(2);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		root.right.right.left = new Node(14);
		root.right.right.right = new Node(15);
		System.out.println(width(root));

	}
	static int width(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		int size=0;
		if(root==null)
			return 0;
		q.add(root);
		while(q.isEmpty()==false)
		{
			int c=q.size();
			size=Math.max(size, c);
			for(int i=0;i<c;i++)
			{
				Node t = q.poll();
				if(t.left!=null)
					q.add(t.left);
				if(t.right!=null)
					q.add(t.right);
			}
			
		}
		return size;
	}

}
