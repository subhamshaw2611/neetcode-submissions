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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int totalLength=0;
        while(temp!=null){
            totalLength++;
            temp=temp.next;
        }
        int deleteNode = totalLength-(n-1);
        ListNode left=null,curr=head,right=null;
        for(int i=1;i<deleteNode;i++){
            right=curr.next;
            left=curr;
            curr=right;
        }
        if(curr!=head){
            left.next=curr.next;
            curr.next=null;
        }else{
            head=curr.next;
            curr.next=null;
        }
        return head;
    }
}
