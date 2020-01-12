/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseListRecursive = function(head) {
    // base case
    if (head === null || head.next === null) return head
    // save next
    const temp = head.next
    // get the rest of the linked-list reversed
    const reversed = reverseList(head.next)
    // the last portion of the reversed list should point to the head
    temp.next = head
    // reset the head's next
    head.next = null
    return reversed
    
};

var reverseList = function(head) {
    let resultHead = null // keeps tracks of the result's head
    while (head) {
        // save the next
       const temp = head.next
       // make the next to be the current resultHead (actual reverse)
       head.next = resultHead
       // make the next resultHead to be the current node
       resultHead = head
       // the next iteration
       head = temp
    }
    return resultHead
};
