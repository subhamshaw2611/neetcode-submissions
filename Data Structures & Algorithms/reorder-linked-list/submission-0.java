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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        slow.next=null;
        ListNode head2 = prev;
        ListNode head1 = head;

        ListNode mover = head;
        int flag=1;
        while(head1!=null && head2!=null){
            if(flag==0){
                head2=mover.next;
                mover.next=head1;
                mover=head1;
                flag=1;
            }else{
                head1=mover.next;
                mover.next=head2;
                mover=head2;
                flag=0;
            }
        }
    }
}
