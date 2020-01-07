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
var mergeTwoLists = function(l1, l2) {
    // create a fake element, we can discard it later
    let ans = new ListNode(-1)
    // store the pointer to the fake node (the next pointer is the pointer to our result linked list)
    let temp = ans
    while (l1 && l2) {
        // find what is minimum and point that
        // increment the linked list where we got the minimum from
        if (l1.val < l2.val) {
            ans.next = l1
            l1 = l1.next
        } else {
            ans.next = l2
            l2 = l2.next
        }
        // increment our result linked list
        ans = ans.next
    }
    // find which linked list must still be added to the result
    if (l1) {
        ans.next = l1;
    }
    if (l2) {
        ans.next = l2;
    }
    // the next pointer to our fake node is our result
    return temp.next
};
