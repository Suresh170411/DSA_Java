import java.util.HashSet;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next =  null;
    }
}

public class IntersectionYType{
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
        }else {
            Node curr = head;

            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void print(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node checkIntersection(Node head1, Node head2){

        HashSet<Node> hs = new HashSet<Node>();
        while (head1 != null) {
            hs.add(head1);
            head1 = head1.next;
        }
        while (head2 != null) {
            if (hs.contains(head2)) {
                return head2;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {

        // list 1
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(5);
        node1.next.next.next.next.next = new Node(6);
        node1.next.next.next.next.next.next = new Node(7);

        // list 2
        Node node2 = new Node(10);
        node2.next = new Node(9);
        node2.next.next = new Node(8);
        node2.next.next.next = node1.next.next.next;

        System.out.println(checkIntersection(node1, node2).data);
    }
}