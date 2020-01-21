/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */

/* Recursion based solution */
var isValid = (node, min, max) => {
  if (!node) return true
  // if constraint is not satisified return false
  if (!(node.val > min && node.val < max)) return false;
  return isValid(node.left, min, node.val) && isValid(node.right, node.val, max)
}

var isValidBST = function(root) {
  return isValid(root, Number.MIN_SAFE_INTEGER, Number.MAX_SAFE_INTEGER)
};

/*
  NOTE: in JS NUMBER.MIN_VALUE is the value closest to 0, not the negative minimum
*/