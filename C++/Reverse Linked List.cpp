/**
 * Definition of ListNode
 * 
 * class ListNode {
 * public:
 *     int val;
 *     ListNode *next;
 * 
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
     * @return: The new head of reversed linked list.
     */
    ListNode *reverse(ListNode *head) {
        // write your code here
        if(head == NULL || head->next == NULL) {
            return head;
        }
        ListNode *curt = new ListNode(head->val);
        head = head->next;
        while(head!= NULL) {
            ListNode *temp = head->next;
            head->next = curt;
            curt = head;
            head = temp;
        }
        return curt;
    }
};

