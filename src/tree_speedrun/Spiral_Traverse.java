package tree_speedrun;

import java.util.*;

public class Spiral_Traverse {

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
		spiral(root);
	}
//	static void spiral (Node root)
//	{
//		if(root==null)
//			System.out.println("Empty");
//		Queue<Node> q = new LinkedList<Node>();
//		Stack<Integer> s = new Stack<>();
//		q.add(root);
//		int turn=0;
//		while(q.isEmpty()==false)
//		{
//			int c=q.size();
//			for(int i=0;i<c;i++)
//			{
//				Node t = q.poll();
//				if(turn%2==0)
//					System.out.print(" "+t.data);
//				else
//					s.push(t.data);
//				if(t.left!=null)
//					q.add(t.left);
//				if(t.right!=null)
//					q.add(t.right);
//				
//			}
//			
//			if(turn%2==1)
//			{
//				while(s.isEmpty()==false)
//					System.out.print(" "+s.pop());
//			}
//			turn++;
//			System.out.println();
//			
//		}
//		
//	}
	//Efficient sol
	static void spiral(Node root)
	{
		if(root==null)
			return;
		else
		{
			Stack<Node> s2 = new Stack<>();
			Stack<Node> s1 = new Stack<>();
			s1.push(root);
			while(!(s1.isEmpty() && s2.isEmpty()))
			{
				while(s1.isEmpty()==false)
				{
					Node t = s1.pop();
					System.out.print(t.data+" ");
					if(t.left!=null)
						s2.push(t.left);
					if(t.right!=null)
						s2.push(t.right);
				}
				System.out.println();
				while(s2.isEmpty()==false)
				{
					Node t = s2.pop();
					System.out.print(t.data+" ");
					if(t.right!=null)
						s1.push(t.right);
					if(t.left!=null)
						s1.push(t.left);
				}
				System.out.println();
			}
			
		}
	}

}
