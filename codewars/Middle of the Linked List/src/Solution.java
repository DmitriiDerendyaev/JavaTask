import java.util.ArrayList;


class Solution {
    public static ListNode middleNode(ListNode head) {

        ArrayList<ListNode> array = new ArrayList<>();

        int lenght = 0;

        while (head != null){
            array.add(head);
            head = head.next;
            lenght++;
        }
        return array.get(lenght/2);
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





