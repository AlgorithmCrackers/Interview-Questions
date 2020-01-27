## Merge k Sorted Lists

![Difficulty-Hard](https://img.shields.io/badge/Difficulty-Hard-red)

![Divide and conquer Technique](https://img.shields.io/badge/Technique-Divide_and_conquer-blue)

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

## Example:

```
Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
```

## Complexity Analysis (Divide and conquer):

- **Time complexity** : `O(n * log(k))`. We divide each problem by half. Making it `log(k)` steps. In each step we do `O(n)` work. Where `n` is the number of nodes in a linked-list. Same as `merge sort` complexity analysis.

- **Space complexity** : `O(log(k))`. Stack space to keep on dividing in half. Same as `merge sort` complexity analysis.