import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode prevToMiddleNode = getPreviousToMiddleNode(head);
        prevToMiddleNode.next = prevToMiddleNode.next.next;


        return head;
    }


    private ListNode getPreviousToMiddleNode(ListNode head){
        ListNode prev = null, fastHead = head;
        while (fastHead != null && fastHead.next != null){
            if(prev == null){
                prev = head;
            }
            else {
                prev = prev.next;
            }

            fastHead = fastHead.next.next;
        }
        return prev;
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode( ) {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}





