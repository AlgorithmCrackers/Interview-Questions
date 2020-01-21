/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} s
 * @param {TreeNode} t
 * @return {boolean}
 */
var isSameTree = (r, t) => {
  if (!r || !t) return r === t
  return r.val === t.val && isSameTree(r.left, t.left) && isSameTree(r.right, t.right)
}

var isSubtree = function(s, t) {
  return s !== null && (isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t))
};