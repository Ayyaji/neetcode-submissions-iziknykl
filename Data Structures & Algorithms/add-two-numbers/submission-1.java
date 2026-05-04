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
   
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode s=new ListNode(0);
        ListNode c=s;
        int ca=0;
        while(l1!=null || l2!=null || ca!=0)
        {   int su=ca;
            if(l1!=null)
            {
                su=su+l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                su=su+l2.val;
                l2=l2.next;
            }
            ca=su/10;
            c.next=new ListNode(su%10);
            c=c.next;

        }
        return s.next;

    }
}
