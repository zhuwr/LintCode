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
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head == null || head.next == null) {
            return head;
        }
        ListNode less = new ListNode(0);
        ListNode more = new ListNode(0);
        ListNode ret = less, more_start = more;
        while(head != null) {
            if(head.val < x) {
                less.next = new ListNode(head.val);
                less = less.next;
            }else {
                more.next = new ListNode(head.val);
                more = more.next;
            }
                head = head.next;
        }
        less.next = more_start.next;
        return ret.next;
    }
}

