package Solution;

public class Solution {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> llList = new ArrayList<List<Integer>>();
		if (root == null)
	        return llList;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//Queue<TreeNode> tmpqueue = new LinkedList<TreeNode>();
		queue.add(root);
		while(queue.isEmpty()!=true){
			List<Integer> sublist = new ArrayList<Integer>();
			Queue<TreeNode> tmpqueue = new LinkedList<TreeNode>();
			for(TreeNode child : queue){
				sublist.add(child.val);
				if(child.left != null)
					tmpqueue.add(child.left);
				if(child.right != null)
					tmpqueue.add(child.right);
	
			}
			llList.add(sublist);
			queue = tmpqueue;
		}
		return llList;
    } 

}
