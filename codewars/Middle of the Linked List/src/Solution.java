import java.util.ArrayList;
import java.util.List;


//class Solution {
//    public static ListNode middleNode(ListNode head) {
//
//        ArrayList<ListNode> array = new ArrayList<>();
//
//        int lenght = 0;
//
//        while (head != null){
//            array.add(head);
//            head = head.next;
//            lenght++;
//        }
//        return array.get(lenght/2);
//    }
//}

class Solution {
    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
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





