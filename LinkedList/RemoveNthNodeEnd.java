package LinkedList;

class Solution3{
    public static class ListNode {
        int val;
        Solution3.ListNode next;

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
        public ListNode RemoveNthNodeEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode first = dummy, second = dummy;
            while(n>0){
                second = second.next;
                n--;
            }
            while(second.next!=null){
                first = first.next;
                second = second.next;
            }
            first.next = first.next.next;
            return dummy.next;
        }
    public void printList(Solution3.ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
class Remove{
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Solution3.ListNode node5 = new Solution3.ListNode(5);
        Solution3.ListNode node4 = new Solution3.ListNode(4, node5);
        Solution3.ListNode node3 = new Solution3.ListNode(3, node4);
        Solution3.ListNode node2 = new Solution3.ListNode(2, node3);
        Solution3.ListNode node1 = new Solution3.ListNode(1, node2);

//      Solution3.ListNode removeNth = s.RemoveNthNodeEnd(node1,2);
        System.out.println("Original list:");
        s.printList(node1);

        s.RemoveNthNodeEnd(node1,2);
        System.out.println("reordered list");
        s.printList(node1);

    }
}