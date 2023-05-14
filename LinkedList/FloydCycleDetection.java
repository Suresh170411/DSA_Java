import java.util.HashSet;
import java.util.Set;

public class FloydCycleDetection {
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

        if (head == null){
            head  = node;
        }else {
            Node curr = head;

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

    public void checkCycle(){
        Node curr = head;

        Set<Node> set = new HashSet<>();

        while (curr != null){
            if (set.contains(curr)){
                System.out.println("Cycle Found");
                return;
            }
            set.add(curr);
            curr = curr.next;
        }
        System.out.println("Cycle Not Found");
    }

    public boolean checkFloydCycle(){
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FloydCycleDetection list = new FloydCycleDetection();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.print();

        list.head.next.next.next.next = list.head;

        // System.out.println(list.checkFloydCycle());
        list.checkCycle();
    }
}
