# Trees and Graphs

## Trees
- Given a binary tree and a sum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum. - **[hasPathSum](hasPathSum)**
- Write a program to verify whether the given tree is a binary search tree.( with and without using recursion) - **[isBST](isBST)**
- Check if all the leaves are at the same level in a binary tree - **[sameLevel](sameLevel)**
- Given a tree, find the path that sums up to a given number. - **[pathSum2](pathSum2)**
- Using a tree, find the first common ancestor of two nodes
- Print out the parent and children given a particular depth in a given tree.
- Determine if a tree is balanced. - **[isBalanced](isBalanced)**
- How to check whether a binary tree is identical to another binary tree? What is the time complexity? - **[sameTree](sameTree)**
- Serialization and deserialization of a tree to a string. If every node of tree represents a letter serialize tree to string in a way that you can deserialize the same string to a tree again. 
- Nearest ancestor node of binary tree.
- Given the inorder traversal of a n-ary tree where every node can have either n or 0 children, and is marked "p" if that node has n children, or marked "q" if that node has 0 children, try reconstruct that tree.
- Convert each level of Binary tree into a linked list - **[levelOrderTraversal](levelOrderTraversal)**
- Given a binary tree(not necessarily BST), return the sum of all kth level nodes. What is the complexity?
- Level order traversal of a binary tree - **[levelOrderTraversal](levelOrderTraversal)**
- Write a function to find the total number of leaf nodes in a binary tree. **[countTheLeaves](countTheLeaves)**

## Graphs
- You are given a list of projects and a list of dependencies. All of a project's dependencies must be built before the project is. Find a build order that will allow the projects to be built. If there is no valid build order return an error. - **[projectDependencies](projectDependencies)**
- Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water. - **[numberOfIslands](numberOfIslands)**

### Sources
- [Cool questions from stanford](http://cslibrary.stanford.edu/110/BinaryTrees.html)

### Java Binary Search Tree Structure

``` java
public class BinaryTree {
  // Root node pointer. Will be null for an empty tree.
  private Node root;

  /*
   --Node--
   The binary tree is built using this nested node class.
   Each node stores one data element, and has left and right
   sub-tree pointer which may be null.
   The node is a "dumb" nested class -- we just use it for
   storage; it does not have any methods.
  */
  private static class Node {
    Node left;
    Node right;
    int data;

    Node(int newData) {
      left = null;
      right = null;
      data = newData;
    }
  }

  /**
   Creates an empty binary tree -- a null root pointer.
  */
  public void BinaryTree() {
    root = null;
  }


  /**
   Returns true if the given target is in the binary tree.
   Uses a recursive helper.
  */
  public boolean lookup(int data) {
    return(lookup(root, data));
  }


  /**
   Recursive lookup  -- given a node, recur
   down searching for the given data.
  */
  private boolean lookup(Node node, int data) {
    if (node==null) {
      return(false);
    }

    if (data==node.data) {
      return(true);
    }
    else if (data<node.data) {
      return(lookup(node.left, data));
    }
    else {
      return(lookup(node.right, data));
    }
  }


  /**
   Inserts the given data into the binary tree.
   Uses a recursive helper.
  */
  public void insert(int data) {
    root = insert(root, data);
  }


  /**
   Recursive insert -- given a node pointer, recur down and
   insert the given data into the tree. Returns the new
   node pointer (the standard way to communicate
   a changed pointer back to the caller).
  */
  private Node insert(Node node, int data) {
    if (node==null) {
      node = new Node(data);
    }
    else {
      if (data <= node.data) {
        node.left = insert(node.left, data);
      }
      else {
        node.right = insert(node.right, data);
      }
    }

    return(node); // in any case, return the new pointer to the caller
  }
  .........
  ....
  ..
}
```
