/**
 * Definition for singly-linked list.
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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        int flag = 0;
        int sum = 0;
        ListNode head = new ListNode(0);
        ListNode ret = new ListNode(0);
        ret = head;
        while(l1 != null && l2 !=null) {
            sum = l1.val + l2.val + flag;
            flag = sum/10;
            head.next = new ListNode(sum%10);
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }
        
        while(l1 != null) {
            sum = l1.val + flag;
            flag = sum/10;
            head.next = new ListNode(sum%10);
            l1 = l1.next;
            head = head.next;
            
        }
        while(l2 != null) {
            sum = l2.val + flag;
            flag = sum/10;
            head.next = new ListNode(sum%10);
            l2 = l2.next;
            head = head.next;
        }
        if(flag != 0) {
            head.next = new ListNode(flag);
        }

        //sum.next = null;
        return ret.next;
    }
}
