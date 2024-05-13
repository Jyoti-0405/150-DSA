package LinkedList;

class Solution {
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
        public ListNode ReverseLinkedList(ListNode head){
            ListNode curr = head;
            ListNode prev = null;
            while(curr!=null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

}
class Reverse{
    public static void main(String[] args) {
        Solution s = new Solution();
        // Create ListNode objects for each value separately
        Solution.ListNode node5 = new Solution.ListNode(5);
        Solution.ListNode node4 = new Solution.ListNode(4, node5);
        Solution.ListNode node3 = new Solution.ListNode(3, node4);
        Solution.ListNode node2 = new Solution.ListNode(2, node3);
        Solution.ListNode node1 = new Solution.ListNode(1, node2);

        // Pass the head of the list to ReverseLinkedList method
        Solution.ListNode reversedList = s.ReverseLinkedList(node1);

        // Print the reversed list
        while (reversedList != null) {
            System.out.print(reversedList.val + "->");
            reversedList = reversedList.next;
        }
    }
}

    
