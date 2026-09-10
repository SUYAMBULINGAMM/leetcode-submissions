class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
// Creating a dummy node to simplify the removal of head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // 1. Move fast n+1 step forward so that slow is in front of the node being deleted
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // 2. Move fast to the end, and slow to the node before the deleted one
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // 3. Remove the nth node from the end (slow.next points to it)
slow.next = slow.next.next;
        
        // Returning a new head (dummy.next could have changed if the head was deleted)
        return dummy.next;
    }
}