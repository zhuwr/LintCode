/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        ListNode ret = head;
        for(int i=n; i>0; i--) {
            head = head.next;
        }
        while(head != null) {
            ret = ret.next;
            head = head.next;
        }
        return ret;
    }
}
