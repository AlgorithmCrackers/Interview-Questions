## Q1 : How to check whether there is a loop in a linked list?

For example, the list in the Figure below has a loop.

![Figure-1](http://3.bp.blogspot.com/-Wp_2IFN624w/TxQ4Dcqg-OI/AAAAAAAABGo/QztnZcdLK48/s1600/29_Figure1.PNG)

### Solution
Two pointers are initialized at the head of list. One pointer forwards once at each step, and the other forwards twice at each step. If the faster pointer meets the slower one again, there is a loop in the list. Otherwise there is no loop if the faster one reaches the end of list.

``` cpp
bool hasLoop(struct node *head)
{
    struct node *pslow = head;
    struct node *pfast = head;
    while(pfast != NULL && pfast->next != NULL)
    {
        pslow = pslow->next;
        pfast = pfast->next->next;
        if(pslow == pfast)
            return true;
    }
    return false;
}

```
## Q2: If there is a loop in a linked list, how to get the entry node of the loop?

> The entry node is the first node in the loop from head of list. For instance, the entry node of loop in the list of Figure 1 is the node with value 3.

#### [LeetCode link](https://leetcode.com/problems/linked-list-cycle/)

#### [Detailed discussion](http://k2code.blogspot.in/2010/04/how-would-you-detect-loop-in-linked.html)
