package LinkedList;

public class SortedList {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode res = head;
        while (head != null && head.next != null) {
            // System.out.println(head.val);
            if(head.val == head.next.val){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(2);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode head = deleteDuplicates(node1);

        while(head != null){
            System.out.println(head.val);
            head= head.next;
        }
    }

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
}
