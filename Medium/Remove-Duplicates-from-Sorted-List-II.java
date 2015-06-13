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
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode curt = new ListNode(0);
        ListNode ret = curt;
        
        while(head != null && head.next != null) {
            if(head.val != head.next.val) {
                curt.next = new ListNode(head.val);
                curt = curt.next;
                head = head.next;
            }
            else {
                while( head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head = head.next;
            }
        }
        if(head != null) {
            curt.next = new ListNode(head.val);
        }
        return ret.next;
        
    }
}
