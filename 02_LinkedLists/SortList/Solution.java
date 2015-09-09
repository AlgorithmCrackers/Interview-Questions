/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode mid = findMid(head);
        ListNode r = mid.next;
        //divide step
        mid.next = null;
        
        ListNode l = sortList(head);
        r = sortList(r);
        return merge(l, r);
    }
    //merge step
    public ListNode merge(ListNode l, ListNode r) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l != null && r != null) {
            if(l.val < r.val) {
                cur.next = l;
                l = l.next;
            } else {
                cur.next = r;
                r = r.next;
            }
            cur = cur.next;
        }
        if(l != null) {
            cur.next = l;   //append the remaining list to cur
        } else {
            cur.next = r;
        }
        return dummy.next;
    }
    
    public ListNode findMid(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        //fast jumps everytime twice so it goes to half
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}