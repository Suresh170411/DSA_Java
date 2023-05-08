import java.util.HashSet;

public class DetectCycle {

    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void add(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public boolean detectLoopBF(Node head){
        HashSet<Node> set = new HashSet<>();

        while (head != null){
            if (set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String [] args){
        DetectCycle llist = new DetectCycle();

        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);

        // for testing purpose created a loop
        llist.head.next.next.next.next = llist.head; 

        boolean res = llist.detectLoopBF(llist.head);
        System.out.println(res);
    }
}
