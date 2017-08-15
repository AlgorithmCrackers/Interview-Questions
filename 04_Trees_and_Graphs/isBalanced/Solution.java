class Solution {

  public static boolean isBalanced(TreeNode root) {
    return getHeight(root) != -1;
  }

  // recursive function to determine the height of a tree, returns -1 if its a unbalanced tree
  private static int getHeight(TreeNode node) {
    if(node == null) return 0;
    // check if left subtree is balanced
    int leftHeight = getHeight(node.left);
    if(leftHeight == -1) return -1;
    // check if right subtree is balanced
    int rightHeight = getHeight(node.right);
    if (rightHeight == -1) return -1;
    // if the difference between the height of left and right subtrees is not greater than 1
    int difference = leftHeight - rightHeight;
    if (Math.abs(difference) > 1) return -1;
    // return the height of this subtree
    return Math.max(leftHeight, rightHeight);
  }
}
