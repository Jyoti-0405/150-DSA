package LinkedList;

class Solution5{
    public static class ListNode{
        int val;
        Solution5.ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, Solution5.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public boolean LinkedListCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
class Cycle{
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        Solution5.ListNode node1 = new Solution5.ListNode(3);
        Solution5.ListNode node2 = new Solution5.ListNode(2);
        Solution5.ListNode node3 = new Solution5.ListNode(0);
        Solution5.ListNode node4 = new Solution5.ListNode(-4);
        System.out.println(s.LinkedListCycle(node1));

    }
}

