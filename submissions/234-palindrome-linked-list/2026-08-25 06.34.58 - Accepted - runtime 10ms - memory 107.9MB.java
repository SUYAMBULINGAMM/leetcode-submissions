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
    public boolean ispal(ListNode rev,ListNode head)
    {
        while(rev.next!=null && head.next!=null)
        {
            if(rev.val != head.val)
            {
                return false;
            }
            rev=rev.next;
            head=head.next;
        }
        return true;
    }
    public ListNode copyList(ListNode head)
    {
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
        ListNode temp=head;
        while(temp!=null)
        {
            curr.next=new ListNode(temp.val);
            curr=curr.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode rev=copyList(head);
        ListNode prev=null;
        ListNode curr=rev;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        rev=prev;
        if(ispal(rev,head))
        {
            return true;
        }
        return false;
    }
}