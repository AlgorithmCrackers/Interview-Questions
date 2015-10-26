

class Solution {
  static void delFirstOccurence(LinkedListNode head, int data){
    LinkedListNode cur = head;
    while(cur != null){
      if(cur.data == data) {  // found the first occurence
        if(cur.prev != null) {
          cur.prev.next = cur.next;
        }
        if(cur.next != null) {
          cur.next.prev = cur.prev;
        }
        return;
      }
      cur = cur.next;
    }
  }
}