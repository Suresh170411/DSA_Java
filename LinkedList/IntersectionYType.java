import java.util.HashSet;
import java.util.Set;

public class IntersectionYType{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =  null;
        }
    }

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

    public void checkIntersection(Node head1, Node head2){

        Set<Node> set = new HashSet<>();

        while (head1.next != null){
            set.add(head1);
            head1 = head1.next;
        }

        while (head2.next != null){
            if (set.contains(head2)){
                System.out.println("Intersection Found with the node : " + head2.data);
                break;
            }
            set.add(head2);
        }

        System.out.println("No Intersection Found");
    }

    public static void main(String[] args) {
        IntersectionYType list1 = new IntersectionYType();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(7);
        list1.add(8);


        IntersectionYType list2 = new IntersectionYType();

        list2.add(4);
        list2.add(5);
        list2.add(list1.head.next.next.next.data);
        list2.add(7);
        list2.add(8);

        list1.print();
        list2.print();

        list1.checkIntersection(list1.head, list2.head);
    }
}