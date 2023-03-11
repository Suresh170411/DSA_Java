package LinkedList;

public class SinglyLinkedList {
    
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

       // now we will connect them together to form a chain
       sll.head.next = second; // 10 --> 1
       second.next = third; // 10 --> 1 --> 8
       third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null

    }

}
