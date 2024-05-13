package LinkedList;


class Solution2{
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
        public void ReorderList(ListNode head) {
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode second = slow.next;
            ListNode prev = slow.next = null;
            while(second!=null){
                ListNode next = second.next;
                second.next = prev;
                prev = second;
                second = next;
            }
            ListNode first = head;
            second = prev;
            while(second!=null){
                ListNode temp1 = first.next;
                ListNode temp2 = second.next;
                first.next = second;
                second.next = temp1;
                first = temp1;
                second = temp2;
            }
        }

    // Utility method to print the linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
class Reorder{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        // Create ListNode objects for each value separately
        Solution2.ListNode node4 = new Solution2.ListNode(4);
        Solution2.ListNode node3 = new Solution2.ListNode(3, node4);
        Solution2.ListNode node2 = new Solution2.ListNode(2, node3);
        Solution2.ListNode node1 = new Solution2.ListNode(1, node2);

        System.out.println("Original list:");
        s.printList(node1);
        // Reorder the list
        s.ReorderList(node1);
        System.out.println("Reordered list:");
        s.printList(node1);
    }
}
