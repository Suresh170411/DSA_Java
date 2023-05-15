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

    /**
     * The function checks if a linked list contains a cycle by using a hash set to keep track of
     * visited nodes.
     */
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

    /**
     * This function checks if there is a cycle in a linked list using Floyd's cycle-finding algorithm.
     * 
     * @return The method is checking if there is a cycle in a linked list using Floyd's cycle-finding
     * algorithm. It returns a boolean value indicating whether a cycle is present or not. If a cycle
     * is present, it returns true, otherwise, it returns false.
     */
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
