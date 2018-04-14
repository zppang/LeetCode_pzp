package Solution;


public class Solution {

	public boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		TreeNode node1 = root.left;
		TreeNode node2 = root.right;
        return checkNodes(node1, node2);
    }
    
	public boolean checkNodes(TreeNode node1, TreeNode node2) {
		if(node1 == null && node2 == null)
			return true;
		if(node1 == null || node2 == null)
			return false;
		if(node1.val == node2.val)
		{
			TreeNode node3 = node1.left;
			TreeNode node4 = node2.right;
			TreeNode node5 = node1.right;
			TreeNode node6 = node2.left;
			return checkNodes(node3, node4) && checkNodes(node5, node6);
			
		}
		else
            return false;
	}

}
