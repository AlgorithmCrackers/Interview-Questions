class Solution {
	class ListNode {
		int data;
		ListNode next;
		ListNode(int data) { this.data = data; }
	}

	public ListNode deleteAtPos(ListNode head, int position) {
		if (position == 1) {
			if (head != null) head = head.next;
			return head;
		}
		ListNode curr = head;
		ListNode prevNode = curr;
		int count = 0;
		while(curr != null) {
			count++;
			if(count == position) {
				prevNode.next = curr.next;
				curr.next = null;
			}
			else {
				prevNode = curr;
				curr = curr.next;
			}
		}
		return head;
	}

}
