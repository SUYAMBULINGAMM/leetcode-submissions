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
    public void delete(ListNode head,int pos)
    {
        if(head == null)
        {
            return;
        }
        ListNode temp=head;
        ListNode prev=null;
        for(int i=1;i<pos;i++)
        {
            prev=temp;
            temp=temp.next;
        }
        if(prev == null)
        {
            return;
        }
        prev.next=temp.next;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode Newhead=prev;
        if( n == 1)
        {
            Newhead=Newhead.next;
        }
        else
        {
            delete(Newhead,n);
        }
        ListNode prev1=null;
        ListNode curr1=Newhead;
        ListNode next1=null;
        while(curr1!=null)
        {
            next1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=next1;
        }
        return prev1;


    }
}