/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {number[][]}
 */
var pathSum = function(root, sum) {
  let allPaths = [];
  recur(root, sum, [], allPaths);
  return allPaths;
};

const recur = (node, sum, parents, allPaths) => {
  if (node === null) return;
  // if its a leaf and if the sum we need to check is equivalent to node's value then bingo we have a path
  if (node.left === null && node.right === null && node.val === sum) {
    allPaths.push([...parents, node.val]);
  }
  // the child of this node must know that this is its parent
  parents.push(node.val);
  // subtract the current sum with the root's value, so that the child can check
  recur(node.left, sum - node.val, parents, allPaths);
  recur(node.right, sum - node.val, parents, allPaths);
  // we need to pop the array with this node as the parent, so that while reucrring we dont hit invalid parents 
  parents.pop();
}