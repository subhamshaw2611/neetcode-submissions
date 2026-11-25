/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node temp=head;
        while(temp!=null){
            Node copyNode = new Node(temp.val);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            temp.next.random = (temp.random==null? null:temp.random.next);
            temp=temp.next.next;
        }
        temp=head.next;
        while(temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return head.next;
    }
}
