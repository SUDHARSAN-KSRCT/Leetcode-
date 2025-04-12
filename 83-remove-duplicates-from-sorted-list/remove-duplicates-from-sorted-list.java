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
    public ListNode deleteDuplicates(ListNode head) {
          if (head == null) {
            System.out.println("List Is Empty");
            return null;
        }

        ListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                while (temp.next != null && temp.val == temp.next.val) {
                    ListNode rem = temp.next.next;
                    temp.next.next = null;
                    temp.next = rem;
                }
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}