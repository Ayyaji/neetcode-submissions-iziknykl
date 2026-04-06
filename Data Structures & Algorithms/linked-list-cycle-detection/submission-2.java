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
    public boolean hasCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null&& f.next!=null)
        {
            if(f.next.next!=null)
                f=f.next.next;
            else
                return false;
            s=s.next;
            if(f!=null &&f.val==s.val)
              return true;
            
        }
        return false;
    }
}
