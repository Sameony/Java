package tree_speedrun;
//leetcode
public class Right_View {
//	/**
//	 * Definition for a binary tree node.
//	 * public class TreeNode {
//	 *     int val;
//	 *     TreeNode left;
//	 *     TreeNode right;
//	 *     TreeNode() {}
//	 *     TreeNode(int val) { this.val = val; }
//	 *     TreeNode(int val, TreeNode left, TreeNode right) {
//	 *         this.val = val;
//	 *         this.left = left;
//	 *         this.right = right;
//	 *     }
//	 * }
//	 */
//	class Solution {
//	    public List<Integer> rightSideView(TreeNode root) {
//	        ArrayList<Integer> res = new ArrayList<>();
//	        if(root==null)
//	            return res;
//	        Queue<TreeNode> q = new LinkedList<TreeNode>();
//	        q.add(root);
//	        while(q.isEmpty()==false)
//	        {
//	            int c = q.size();
//	            for(int i=0;i<c;i++)
//	            {
//	                TreeNode t = q.poll();
//	                if(i==c-1)
//	                    res.add(t.val);
//	                if(t.left!=null)
//	                    q.add(t.left);
//	                if(t.right!=null)
//	                    q.add(t.right);
//	            }
//	        }
//	        return res;
//	    }
//	    
//	}
}
