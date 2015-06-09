public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        int count = 1;
        ListNode curt = head;
        if(curt.next == null) {
            return null;
        }
        while(curt!=null) {
            curt = curt.next;
            count++;
        }
        int index = count - n;
        if(index ==1) {
            head = head.next;
            return head;
        }
        curt = head;
        for(int i=1; i<index-1; i++) {
            curt = curt.next;
        }
        curt.next = curt.next.next;
        return head;
    }
}
