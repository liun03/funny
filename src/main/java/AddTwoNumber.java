import utils.ListNode;

public class AddTwoNumber {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                ListNode result = null;
                int carry = 0;
                ListNode currentNode = null;

                while (l1 != null || l2 != null || carry != 0) {
                        int n1 = l1 == null ? 0 : l1.val;
                        int n2 = l2 == null ? 0 : l2.val;
                        int sum = n1 + n2 + carry;
                        ListNode ln = new ListNode(sum % 10);
                        carry = sum / 10;
                        if (result == null) {
                                currentNode = ln;
                                result = ln;

                        } else {
                                currentNode.next = ln;
                                currentNode = currentNode.next;
                        }
                        l1 = l1 == null ? null : l1.next;
                        l2 = l2 == null ? null : l2.next;
                }
                return result;
        }
}
