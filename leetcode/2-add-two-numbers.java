//2. Add Two Numbers 
//https://leetcode.com/problems/add-two-numbers/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = new ListNode(0);
        current = result;
        int carry = 0;
        int val = 0;
        while(l1!=null&&l2!=null){
            val=l1.val+l2.val+carry;
            carry = val>9 ? 1 : 0;
            val %= 10;
            ListNode next = new ListNode(val);
            current.next = next;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        if(l1!=null){
            while(l1!=null){
                val = l1.val+carry;
                carry = val>9 ? 1 : 0;
                val %= 10;
                ListNode next = new ListNode(val);
                current.next = next;
                current = current.next;
                l1 = l1.next;
            }
        }
        
        if(l2!=null){
            while(l2!=null){
                val = l2.val+carry;
                carry = val>9 ? 1 : 0;
                val %= 10;
                ListNode next = new ListNode(val);
                current.next = next;
                current = current.next;
                l2 = l2.next;
            }
        }
        
        if(carry == 1){
            ListNode next = new ListNode(1);
            current.next = next;
            current = current.next;
        }
        
        return result.next;
    }
}
