public class LList {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    private int size;

    // add node to the first
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

    // add note to the last
    public void addLast(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            Node currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    // print all the node
    public void print(){
        Node node = head;

        if (node == null){
            System.out.println("Empty list !");
            return;
        }

        while (node != null){
            System.out.print(node.data+"-->");
            node = node.next;
        }
        System.out.println("null");
    }

    // print size of the list
    public int getSize(){
        return size;
    }

    // delete the first node 
    public void delteFirst(){
        if (head == null){
            System.out.println("List is Empty !");
            return;
        }
        head = head.next;
        size--;
    }

    // delete last node
    public void deleteLast(){
        if (head == null){
            System.out.println("List is Empty !");
            return;
        }

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
        size--;
    }

    public static void main(String[] args){
        LList list = new LList();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(4);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);

        list.print();
        System.out.println(list.getSize());
        list.delteFirst();
        list.print();
        list.deleteLast();
        list.print();
        System.out.println(list.getSize());
    }

}
