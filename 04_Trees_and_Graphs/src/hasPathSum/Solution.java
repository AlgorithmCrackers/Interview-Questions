
public class Solution {
    boolean hasPathSum(TreeNode node, int sum){
       if (node == null) {
         return (sum == 0);
       }
       // check both the subtrees
      int remainingSum = sum - node.data;
      return ( hasPathSum(node.left, remainingSum) ||
               hasPathSum(node.right, remainingSum) );
    }
}
