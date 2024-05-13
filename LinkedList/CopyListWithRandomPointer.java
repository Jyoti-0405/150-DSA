package LinkedList;

import java.util.HashMap;
import java.util.Map;

class Solution4{
    public static class ListNode {
        int val;
        Solution4.ListNode next;
        Solution4.ListNode random;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next,ListNode random) {
            this.val = val;
            this.next = next;
            this.random = random;
        }
    }
    public ListNode CopyListWithRandomPointer(ListNode head) {
        Map<ListNode, ListNode> map = new HashMap<>();
        ListNode curr = head;
        while(curr!=null){
            map.put(curr, new ListNode(curr.val));
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
    public void printList(Solution4.ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
class Random{
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        Solution4.ListNode node1 = new Solution4.ListNode(1);
        Solution4.ListNode node2 = new Solution4.ListNode(2);
        Solution4.ListNode node3 = new Solution4.ListNode(3);

        node1.next = node2;
        node1.random = node3;
        node2.next = node3;
        node2.random = node1;
        node3.random = node2;

        Solution4.ListNode copiedHead = s.CopyListWithRandomPointer(node1);

        // Print original and copied lists for verification
        System.out.println("Original List:");
        s.printList(node1);;
        System.out.println("\nCopied List:");
        s.printList(copiedHead);
    }
}

