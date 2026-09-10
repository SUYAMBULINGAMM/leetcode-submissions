/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        int div;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        temp=head;
        if(count%2 == 0)
        {
            div=(count/2);
        }
        else
        {
            div=count/2;
        }
        for(int i=0;i<div;i++)
        {
            temp=temp.next;
        }
        head=temp;
        return head;
    }
}