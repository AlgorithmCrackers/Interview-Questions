# Subtree of Another Tree

#### Difficulty in LeetCode
![Difficulty-Easy](https://img.shields.io/badge/Difficulty-Easy-green)

#### Difficulty of understanding complexity
![Difficulty-Medium](https://img.shields.io/badge/Difficulty-Medium-yellow)

Given two non-empty binary trees `s` and `t`, check whether tree t has exactly the same structure and node values with a subtree of `s`. A subtree of `s` is a tree consists of a node in `s` and all of this node's descendants. The tree `s` could also be considered as a subtree of itself.


## Example 1:

```
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
```

## Example 2:

```
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
```

## Complexity Analysis (Recursive Comparision Approach):

- **Time complexity** : `O(m * n)`. Where `n` is number of nodes in **s** and `m` is number of nodes in **t**.

An alternative approach is to search through the larger tree, Tl , Each time a node in Tl matches the root of T2, call `isSameTree`. The matchTree method will compare the two subtrees to see if they are identical. Analyzing the runtime is somewhat complex. A naive answer would be to say that it is 0(nm) time, where n is the number of nodes in Tl and m is the number of nodes in T2. While this is technically correct, a little more thought can produce a tighter bound


   * I think it's because in the worst case, the `isSameTree` method is called for each node. The `isSameTree` method will be O(n) with `n` being the size of the smaller tree. You are calling this `m` times with m being the size of the larger tree, so O(m)O(n) = O(mn)
   * If the every element in the bigger tree contains same elements as the smaller tree, each time we need to compare until we find that the smaller tree reaches null but bigger tree's branch not. This process is persistence among all of the tree, so it would be m times n
   * For Approach#2 O(mn) is definitely overestimating. The upper bound is closer to O(m + kn) where k is the number of nodes for which the root of t matches the value of the node of s that's just being traversed. To prove this point let's rewrite the traverse method slightly differently and add s.val == t.val && before the equals(s, t) call. Now it's clearer that equals is doing work only when the root of t matches the current node of s. How much work will it do? If the 2 trees match, it will do O(n) work. Otherwise, on any mismatch we'll break early so even O(m + k*n) is an over estimate.
      * It's more complicated than that. If all n nodes match the root of the t, then traverse will no longer do O(n) work, unless t itself is also equal to all the same values. But then, it will only do that O(n) work once because of the ||. CTCI solution discusses this problem a little more in depth and looks at the runtime in a probabilistic fashion and proves this point.
- **Space complexity** : `O(log(n)) - best, o(n) worst`. The best case is for a completely balanced tree. The worst case is for an unbalanced tree. The space is to keep a recursion stack. `n` is number of nodes in **s**.

#### [LeetCode link](https://leetcode.com/problems/subtree-of-another-tree/)