package org.example.addtwonumbers;

class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        int carry = 0;

        ListNode head = l3;

        while(l1!=null && l2!=null){
            int sum = l1.val+l2.val+carry;
            carry = sum/10;
            l3.next = new ListNode(sum%10);

            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }

         while(l1!=null){
            int sum = l1.val+carry;
            carry = sum/10;
            l3.next = new ListNode(sum%10);

            l3 = l3.next;
            l1 = l1.next;
        }

         while( l2!=null){
            int sum = l2.val+carry;
            carry = sum/10;
            l3.next = new ListNode(sum%10);

            l3 = l3.next;
            l2 = l2.next;
        }

        if(carry>0){
            l3.next = new ListNode(carry);
        }

        return head.next;
    }
}