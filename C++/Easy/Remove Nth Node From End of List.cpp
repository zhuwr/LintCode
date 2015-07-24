/**
 * Definition of ListNode
 * class ListNode {
 * public:
 *     int val;
 *     ListNode *next;
 *     ListNode(int val) {
 *         this->val = val;
 *         this->next = NULL;
 *     }
 * }
 */
class Solution {
public:
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode *removeNthFromEnd(ListNode *head, int n) {
        // write your code here
        if(n == 0) {
            return head;
        }
        ListNode *fast = head;
        ListNode *slow = new ListNode(0);
        ListNode *ret = slow;
        slow->next = head;
        for(int i=0; i<n; i++) {
            fast = fast->next;
        }
        while(fast!=NULL) {
            fast = fast->next;
            slow = slow->next;
        }
        slow->next = slow->next->next;
        return ret->next;
    }
};
