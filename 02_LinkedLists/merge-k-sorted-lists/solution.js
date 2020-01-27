/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode[]} lists
 * @return {ListNode}
 */

const mergeTwoLists = (list1, list2) => {
  let fake = new ListNode(-1)
  const ptrToFake = fake
  while(list1 && list2) {
      if (list1.val < list2.val) {
          fake.next = list1
          list1 = list1.next
      } else {
          fake.next = list2
          list2 = list2.next
      }
      fake = fake.next
  }

  if (list1) {
      fake.next = list1
  }

  if (list2) {
      fake.next = list2
  }

  return ptrToFake.next
}


var mergeKLists = function(lists) {
  if (!lists || lists.length === 0) return null
  if (lists.length === 1) return lists[0]

  // split array in half
  const halfwayThrough = Math.floor(lists.length / 2)

  const arrayFirstHalf = lists.slice(0, halfwayThrough)
  const arraySecondHalf = lists.slice(halfwayThrough, lists.length)

  // do work for each halfs
  const mergedLeft = mergeKLists(arrayFirstHalf)
  const mergedRight = mergeKLists(arraySecondHalf)
  // merge the halfs
  return mergeTwoLists(mergedLeft, mergedRight)

};