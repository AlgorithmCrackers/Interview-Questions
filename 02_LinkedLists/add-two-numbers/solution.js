/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
const addTwoNumbers = function(l1, l2) {
  let current = new ListNode(-1)
  const ptrToFake = current
  // variable to store the carry over after addition (either 1 or  0)
  let carry = 0
  while(l1 || l2) {
      const a = l1 ? l1.val : 0
      const b = l2 ? l2.val : 0
      // actual summing
      sum = carry + a + b
      // find the carry over
      carry = sum > 9 ? 1 : 0
      // the mod to 10 is the required number to store in the node
      // example: 9 + 8 = 17, here 7 will be in the node, 1 goes to carry over
      const node = new ListNode(sum % 10)
      // add to the resulting linked list
      current.next = node
      // iterate to the next nodes
      current = node
      if (l1) {
          l1 = l1.next
      }
      if (l2) {
          l2 = l2.next
      }
  }

  // finally, check if the carry was left over.. this means we need an extra 1
  if (carry) {
      const node = new ListNode(1)
      current.next = node
  }

  return ptrToFake.next
};