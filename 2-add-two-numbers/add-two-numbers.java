class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sudhan = new ListNode(0);
        ListNode sudhan1 = sudhan;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            sudhan1.next = new ListNode(sum % 10);
            sudhan1 = sudhan1.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return sudhan.next;
    }
}