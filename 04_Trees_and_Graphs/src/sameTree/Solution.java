public class Solution {
  public static boolean sameTree(TreeNode tree1, TreeNode tree2) {
    // both are empty
    if(tree1 == null && tree2 == null) {
      return true;
    }
    // both are non empty, compare their data and recurse
    else if(tree != null && tree2 != null) {
        return tree1.data == tree2.data &&
               sameTree(tree1.left, tree2.left) &&
               sameTree(tree1.right, tree2.right);
    }
    // one is empty, other is not
    else {
      return false;
    }
  }
}
