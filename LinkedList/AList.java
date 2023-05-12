import java.util.HashSet;
import java.util.Set;

public class AList {
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
            head = node;
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printlList(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public boolean checkLoop(){
        Node curr = head;

        Set<Node> set = new HashSet<>();

        while (curr != null){
            if (set.contains(curr)){
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public boolean checkCycle(){
        Node slow = head;
        Node fast = head;

        // boolean flag = false;

        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AList list = new AList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.printlList();
        // System.out.println(list.checkLoop());

        list.head.next.next.next.next = list.head;

        list.printlList();

        System.out.println(list.checkCycle());

        
    }
}
