import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

//class Solution{
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
//        ListNode result = new ListNode(0);
//        ListNode pointer1 = l1, pointer2 = l2, currentNode = result;
//        int dozenCarrier = 0;
//
//        while(pointer1 != null || pointer2 != null){
//            int pointerValue1 = (pointer1 == null) ? 0: pointer1.val;
//            int pointerValue2 = (pointer2 == null) ? 0: pointer2.val;
//
//            int sum = pointerValue1 + pointerValue2 + dozenCarrier;
//            dozenCarrier = sum / 10;
//
//            currentNode.next = new ListNode(sum % 10);
//            currentNode = currentNode.next;
//
//            if(pointer1 == null){
//                pointer1 = pointer1.next;
//            }
//            if(pointer2 == null){
//                pointer2 = pointer2.next;
//            }
//        }
//        if(dozenCarrier > 0){
//            currentNode. next = new ListNode(dozenCarrier);
//        }
//
//        return  result.next;
//    }
//}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1 != null || l2 != null){
            int val = 0;
            if(l1 != null && l2 != null){
                val = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 != null){
                val = l1.val + carry;
                l1 = l1.next;
            }else{
                val = l2.val + carry;
                l2 = l2.next;
            }
            cur.next = new ListNode(val % 10);
            carry = val / 10;
            cur = cur.next;
        }
        if(carry == 1)
            cur.next = new ListNode(1);
        return res.next;
    }
}

//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        StringBuilder firstNumber = new StringBuilder();
//        StringBuilder secondNumber = new StringBuilder();
//        while (l1.next != null) {
//            firstNumber.append(l1.val);
//            l1 = l1.next;
//        }
//
//        while (l2.next != null) {
//            secondNumber.append(l2.val);
//            l2 = l2.next;
//        }
//
//        int result = Integer.parseInt(String.valueOf(firstNumber)) + Integer.parseInt(String.valueOf(secondNumber));
//
//        ListNode newList = new ListNode(result % 10);
////
////        while (result != 0){
////            newList
//        return newList;
//    }
//}