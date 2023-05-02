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

    //add - first
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
        Node node = new Node(data);

        if (head == null){
            head = node;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    public void printNode(){

        Node data = head;

        if (data == null){
            return;
        }

        while (data != null){
            System.out.print(data.data+" ");
            data = data.next;
        }
    }

    // delete first node
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty !");
            return;
        }
        head = head.next;
    }

    // delete last node
    public void deleteLast(){

        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            lastNode = lastNode.next;   
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }
    

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(30);
        list.deleteFirst();
        list.deleteLast();
        list.printNode();
    }
}
