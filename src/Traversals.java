import java.util.*;

public class Traversals {
	static int MaxLevel = 0;
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.left.left.left = new Node(80);
		root.left.left.right = new Node(90);
		root.left.right.left = new Node(100);
		root.left.right.right = new Node(110);
		root.right.left.left = new Node(120);
		root.right.left.right = new Node(130);
		root.right.right.left = new Node(140);
		root.right.right.right = new Node(150);
		//LevelTraverseByLine(root);
		System.out.println("Size of tree = "+SizeBin(root));
		//Left view
		LeftView(root);
		
		
	}
	
	static void LeftView(Node root)
	{
		
		if(root==null)
			return;
		helper(root,1);
	}
	static void helper(Node root, int Level)
	{
		if(root==null)
			return;
		else
		{
			
			helper(root.left,Level+1);
			helper(root.right,Level+1);
			if(MaxLevel<Level)
			{
				System.out.println(root.data);
				MaxLevel = Level;
			}
				
		}
	}
	
	static void levelTraverse(Node root)
	{
		if(root!=null)
		{
			Queue<Node> check = new LinkedList<Node>();
			check.add(root);
			while(check.isEmpty()==false)
			{
				Node t = check.poll();
				System.out.print(t.data+" ");
				if(t.left!=null)
					check.add(t.left);
				if(t.right!=null)
					check.add(t.right);
			}
			
		}
	}
	
	static void LevelTraverseByLine(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(q.size()>1)
		{
			Node t = q.poll();
			if(t==null) {
				System.out.println();
				q.add(null);
				}
			else {
				System.out.print(t.data+" ");
				if(t.left!=null)
					q.add(t.left);
				if(t.right!=null)
					q.add(t.right);
			}
			
		}
	}
	static int SizeBin(Node root)
	{
		if(root==null)
			return 0;
		else
			return 1+SizeBin(root.left)+SizeBin(root.right);
	}
	

}
