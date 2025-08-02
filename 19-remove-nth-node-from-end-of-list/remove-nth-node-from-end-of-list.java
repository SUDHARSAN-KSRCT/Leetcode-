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
      ListNode s=head;
      ListNode s1=head;
      for(int i=0;i<n;i++){
        s=s.next;
      }
      if(s==null){
        return head.next;
      }
      while(s.next!=null){
        s=s.next;
        s1=s1.next;
      }
      s1.next=s1.next.next;
      return head;
    }
}