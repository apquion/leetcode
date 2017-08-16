public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode current = ans;
        int carry = 0;
        int one = 0;
        int two = 0;
        while (l1 != null || l2 != null){
            if(l1 == null){one = 0;}else{one = l1.val;} // Inefficient way to extract values from nodes that potentially might be
            if(l2 == null){two = 0;}else{two = l2.val;} // null. Check for better way? 
            int sum = one + two + carry;
            if (sum > 9){
                carry = 1;
                sum -= 10;
            }
            else {
                carry = 0;
            }
            current.next = new ListNode(sum);
            current = current.next;
            if(l1 != null){l1 = l1.next;}
            if(l2 != null){l2 = l2.next;}
        }
        if (carry == 1){
            current.next = new ListNode(carry);
        }
        return ans.next;
    }