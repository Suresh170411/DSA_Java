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

    public void addNode(int data){
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

    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addNodeAfter(int elem, int node){
        Node curr = head;
        Node temp = new Node(node);

        while (curr.data != elem){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
    }

    public void addNodeBefore(int elem, int node){
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        Node temp = new Node(node);
        prev.next = temp;
        temp.next = curr;
    }

    public void deteParticularNode(int elem){
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
    }

    public void deleteAfterNode(int elem){
        Node curr = head;

        while (curr.data != elem){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    public void deleteBeforeNode(int data){
        Node curr = head;
        Node prev = null;
        Node secondPrev = null;

        while (curr.data != data){
            secondPrev = prev;
            prev = curr;
            curr = curr.next;
        }
        secondPrev.next = curr;
    }

    public void printList(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void reverseList(){
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        printList();
    }

    public void findMiddle(){
        Node slow = head;
        Node fast = head;
        // Node prev = null;

        while (fast != null && fast.next != null){
            // prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        // System.out.println(prev.data);
    }

    public static void main(String[] args) {
        AList list = new AList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        // list.deleteBeforeNode(4);

        list.printList();
        list.findMiddle();
    }
}
