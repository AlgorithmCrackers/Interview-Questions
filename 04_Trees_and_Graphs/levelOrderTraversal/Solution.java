public class Solution {
      public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        TreeNode END = new TreeNode(-1);  // marks the end of level
        LinkedList<Integer> level = new LinkedList<Integer>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(END);
        while(!q.isEmpty()) {
        	TreeNode cur = q.removeFirst();
        	if(cur == END) {  // current level is done
        		result.add(level);
        		level = new LinkedList<Integer>();
        		if(!q.isEmpty())  // to avoid infinite add of END
        		    q.add(END);
        		continue;
        	}
        	level.add(cur.val);
        	if(cur.left != null) {
        		q.add(cur.left);
        	}
        	if(cur.right != null) {
        		q.add(cur.right);
        	}
        }
        return result;
    }
}
