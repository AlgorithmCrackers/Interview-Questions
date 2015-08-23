class ReverseList{
  ListNode head;

  
  //recursive method
  public static void reverseListRec(ListNode cur) {
    if(cur == null) return; //null checking
    
    // Base case: tail of the list
    if(cur.next == null) { 
      head = cur;
      return;
    }
    reverseListRec(cur.next);
    // set the second element pointing to first element
    cur.next.next = cur;  
    
    //remove the current element next value
    cur.next = null;
  }
  
  //Iterative method
  public static void reverseListIter(ListNode head) {
    ListNode prev = null;
    ListNode cur = head;
    ListNode next = null;
    while(cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    
    // return prev; if return is Head node then use this
    head = prev;  //sets the last prev node to head
  }


}
