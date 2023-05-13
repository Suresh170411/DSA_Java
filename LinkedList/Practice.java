import java.util.HashSet;
import java.util.Set;

public class Practice {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data){
        Node node = new Node(data);
        Node curr = head;

        if (head == null){
            head = node;
        }else {
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
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

    public void deleteFirst(){
        if (head == null){
            System.out.println("The list is empty !");
            return;
        }
        head = head.next;
    }

    public void deleteLastNode(){
        if (head == null){
            System.out.println("List is empty !");
            return;
        }
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }

    public void findMiddleNode(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public void findMiddleNodeEven(){
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(prev.data);
    }

    public void findLoop(){
        Node curr = head;

        Set<Node> set = new HashSet<>();

        while (curr != null){
            if (set.contains(curr)){
                System.out.println("Loop is present !");
                return;
            }
            set.add(curr);
            curr = curr.next;
        }
        System.out.println("Loop is not present !");
    }

    public static void main(String[] args) {
        Practice list = new Practice();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.add(6);

        list.print();
        
        // list.head.next.next.next.next.next = list.head;

        list.findLoop();
    }
}
