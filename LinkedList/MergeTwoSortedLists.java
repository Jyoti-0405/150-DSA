package LinkedList;

class Solution1 {
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
    public ListNode MergeTwoSortedLists(ListNode l1, ListNode l2){
        ListNode root = new ListNode();
        ListNode curr = root;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 !=null?l1:l2;
        return root.next;
    }

}
class Merge{
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        // Create ListNode objects for each value separately

        Solution1.ListNode node3 = new Solution1.ListNode(4);
        Solution1.ListNode node2 = new Solution1.ListNode(2, node3);
        Solution1.ListNode node1 = new Solution1.ListNode(1, node2);


        Solution1.ListNode nodeC = new Solution1.ListNode(4);
        Solution1.ListNode nodeB = new Solution1.ListNode(3, nodeC);
        Solution1.ListNode nodeA = new Solution1.ListNode(1, nodeB);

        // Pass the head of the list to ReverseLinkedList method
        Solution1.ListNode mergeTwoList = s.MergeTwoSortedLists(node1, nodeA);

        // Print the reversed list
        while ( mergeTwoList!= null) {
            System.out.print(mergeTwoList.val + "->");
            mergeTwoList = mergeTwoList.next;
        }
    }
}


