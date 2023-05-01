public class LL {

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    //add - first, last
    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addLast(int data){
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printNode(Node data){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(30);
        list.printNode(list.head);
    }
}
