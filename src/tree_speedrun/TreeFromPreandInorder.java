package tree_speedrun;

public class TreeFromPreandInorder {

	public static void main(String[] args) {
		int pre[] = {10,20,40,50,30,70,80,90};
		int in[] = {40,20,50,10,30,80,70,90};
		Node head = new Node(0);
		ToBTree(head,pre,in);
		System.out.println(head);

	}
	static void ToBTree(Node head, int[] pre, int[] in)
	{
		if(in.length==0)
			return;
		else
		{
			head.data = in[0];
			
		}
		
	}

}
