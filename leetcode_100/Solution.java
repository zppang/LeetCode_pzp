package Solution;



public class Solution {

	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        TreeNode node1 = p.left;
        TreeNode node2 = q.left;
        TreeNode node3 = p.right;
        TreeNode node4 = q.right;
        return checkNodes(node1, node2) && checkNodes(node3, node4);
    }
    
    public boolean checkNodes(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null)
            return true;
        if(node1 == null || node2 == null)
            return false;
        if(node1.val == node2.val)
        {
            TreeNode node3 = node1.left;
            TreeNode node4 = node2.left;
            TreeNode node5 = node1.right;
            TreeNode node6 = node2.right;
            return checkNodes(node3, node4) && checkNodes(node5, node6);
            
        }
        else return false;
    }

}
