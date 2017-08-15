class Solution {
  public static boolean isBST(TreeNode root) {
    return isBSTRecur(root, Integer.MIN_VALUE, Integer.MAX_VALUE) );
  }
  public static boolean isBSTRecur(TreeNode node, int min, int max) {
    if (node == null) return true;
    // check if min/max constraint is violated
    if (!(node.data > min && node.data < max)) return false;
    // recursively check for subtrees
    return isBSTRecur(node.left, min, node.data) &&
           isBSTRecur(node.right, node.data, max);
  }

}
