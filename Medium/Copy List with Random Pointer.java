/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        RandomListNode curt = head;
        
        while(curt != null) {
            RandomListNode newNode = new RandomListNode(curt.label);
            newNode.next = curt.next;
            newNode.random = null;
            curt.next = newNode;
            curt = newNode.next;
        }
        curt = head;
        RandomListNode newNode = new RandomListNode(0);
        while(curt != null) {
            newNode = curt.next;
            if(curt.random != null) {
            newNode.random = curt.random.next;
            }
            curt = newNode.next;
        }
        newNode = head.next;
        RandomListNode ret = newNode;
        curt = newNode.next;
        while(curt != null) {
            newNode.next = curt.next;
            newNode = newNode.next;
            curt = newNode.next;
        }
        return ret;
    }
}
