# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None:
            return ListNode(None)
        cur = head
        n = prev = 0
        while cur.next != None:
            n = cur.next
            cur.next = prev
            prev = cur
            cur = n
        return prev
        
        