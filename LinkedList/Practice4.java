public class Practice4 {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    private int size;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data){
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
        size++;
    }

    public void printList(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public boolean isPresent(int elem){
        Node curr = head;

        if (curr == null){
            return false;
        }

        while (curr != null){
            if (curr.data == elem){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("List is Empty !");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        Practice4 list = new Practice4();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();
        // System.out.println(list.isPresent(5));
        list.deleteFirst();
        list.printList();
    }
}
