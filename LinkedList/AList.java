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

    public void printList(){
        Node curr = head;

        if (curr == null){
            System.out.println("List is empty !");
            return;
        }else {
            while (curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public void addBefore(int elem, int node){
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        Node newNode = new Node(node);
        prev.next = newNode;
        newNode.next = curr;
    }

    public void addAfter(int elem, int node){
        Node curr = head;

        while (curr.data != elem){
            curr = curr.next;
        }
        Node temp = new Node(node);
        temp.next = curr.next;
        curr.next = temp;
    }

    public void deleteBefore(int elem){
        Node curr = head;
        Node prev = null;
        Node secondLast = null;

        while (curr.data != elem){
            secondLast = prev;
            prev = curr;
            curr = curr.next;
        }
        secondLast.next = prev.next;
    }

    public void deleteAfter(int elem){
        Node curr = head;

        while (curr.data != elem){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    public void reverseNode(){
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

    public static void main(String[] args) {
        AList list = new AList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        list.printList();
        list.reverseNode();

    }
}
