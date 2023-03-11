package LinkedList;

public class SinglyLinkedList {
    
    private ListNode head;

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

       sll.addNodeBegin();

       sll.display();   // displaying all the data from the singly linked list
       System.out.println(sll.getLength()); // length count of signly linked list
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // traversal of singly linked list
    public void display(){
        ListNode current = head;

        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // length count of signly linked list
    public int getLength(){
        ListNode current = head;

        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    // add node to the begining
    public void addNodeBegin(){
        ListNode newNode = new ListNode(40);
        newNode.next = head;
        head = newNode;
    }

}
