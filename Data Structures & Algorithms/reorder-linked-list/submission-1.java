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

        //1) Find Middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //2) Reverse second half
        ListNode curr=slow.next,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        slow.next=null;

        //3) Merge alternately
        ListNode second = prev;
        ListNode first = head;

        while(first!=null && second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
    }
}
