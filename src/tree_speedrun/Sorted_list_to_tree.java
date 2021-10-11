package tree_speedrun;

public class Sorted_list_to_tree {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	public static void main(String[] args) {
		
	}
	
	public Node sortedListToBST(ListNode head) {
        if(head==null) 
            return null;
        return toBST(head,null);
    }
    public Node toBST(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        if(head==tail) return null;
    
        while(fast!=tail&&fast.next!=tail)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node root = new Node(slow.val);
        root.left = toBST(head,slow);
        root.right = toBST(slow.next,tail);
        return root;
    }
}
