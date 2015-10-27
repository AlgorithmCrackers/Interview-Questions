class Solution {
  public static boolean sameLevel(TreeNode root) {
    return sameLevelRecur(root, 0); // the root is at level 0
  }

  public static boolean sameLevelRecur(TreeNode node, int curLevel) {
    static int firstLeafLevel = -1; // -1 is just to find if it is not set yet
    // if its a leaf
    if(node.left == null && node.right == null) {
      // encountered the first leaf
      if (firstLeafLevel == -1) {
        firstLeafLevel = curLevel;
        return true;
      }
      return (curLevel == firstLeafLevel);
    }
    // recurse for the subtrees
    int nextLevel = curLevel+1;
    return sameLevelRecur(node.left, nextLevel) &&
           sameLevelRecur(node.right, nextLevel)
  }
}
