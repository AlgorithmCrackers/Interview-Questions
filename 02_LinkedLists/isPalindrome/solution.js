/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */

 // reverse the linked-list
const reverse = function(head) {
  let prev = null
  while(head) {
      const next = head.next
      head.next = prev
      prev = head
      head = next
  }
  return prev
};

// EVEN: 1 -> 2 -> 3 -> 3 -> 2 -> 1
// slow will be at the 2nd 3 when while loop ends
// ODD: 1 -> 2 -> 3 -> 4 -> 3 -> 2 -> 1
// slow will be at the 4 when while loop ends
const isPalindrome = function(head) {
  let fast = head
  let slow = head
  while (fast !== null && fast.next !== null) {
      fast = fast.next.next
      slow = slow.next
  }
  // slow is at the middle now
  // for EVEN always at the 2nd place.. say for size 6.. slow ends up at 3rd index not the 2nd index
  // for ODD always at the middle .. say for size 7.. slow ends up at 3rd index, exactly middle.. has the extra element so comparision not needed for the last element
  let reversed = reverse(slow)
  // reversed has the half no of elements so need to check if they are equal, thats it
  // the no if elements in head is always greater than of reversed
  while (reversed) {
      if (reversed.val !== head.val) {
          return false
      }
      reversed = reversed.next
      head = head.next
  }
  return true
};