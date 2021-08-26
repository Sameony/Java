// Java program to remove duplicates
// from unsorted linkedlist


public class MoveLastK_Nodes_to_N
{
	static class node
	{
		int val;
		node next;

		public node(int val)
		{
			this.val = val;
		}
	}
	
	/* Function to remove duplicates from a
	unsorted linked list */
	static void removeDuplicate(node head, int k, int n)
	{
		
		node current = head;
		node prev = new node(1);
        prev.next=head;
        //iterating through list node by node to find last k elements
		while (current.next != null)
		{
			k--;
			if (k<=0) {
				prev=prev.next;
			} 
			current = current.next;
		}
        //iterating to nth node
        node nth=head;
        while(n>1)
        {
            n--;
            nth=nth.next;
            
        }
        current.next=nth.next;
        nth.next=prev.next;
        
        prev.next=null;
        

	}
	
	/* Function to print nodes in a given linked list */
	static void printList(node head)
	{
		while (head != null)
		{
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args)
	{
		/* The constructed linked list is:
		10->12->11->11->12->11->10*/
		node start = new node(1);
		start.next = new node(2);
		start.next.next = new node(3);
		start.next.next.next = new node(4);
		start.next.next.next.next = new node(5);
		start.next.next.next.next.next = new node(6);
		start.next.next.next.next.next.next = new node(7);
		start.next.next.next.next.next.next.next = new node(8);
		
		System.out.println("Linked list before removing duplicates :");
		printList(start);

		removeDuplicate(start,2,1);

		System.out.println("\nLinked list after removing duplicates :");
		printList(start);
	}
}
