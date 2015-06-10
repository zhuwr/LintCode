/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        ListNode curt = head;
        ListNode ret = curt;
        if(head == null) {
            return head;
        }
        while(head.next != null) {
            if(head.val == head.next.val) {
                head = head.next;
            }
            else {
                curt.val = head.val;
                head = head.next;
                curt = curt.next;
            }
        }
                curt.val = head.val;

        curt.next = null;
        return ret;
    }  
}
