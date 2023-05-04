public class Practice3 {

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

    /**
     * This method will take one element and will add that to the begining of the LinkedList
     * @param data
     */
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

    /**
     * This method will take one element and put that to the last of the LinkedList
     * @param data
     */
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


    /**
     * This method will print the elements of the linkedList
     */
    public void printList(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    /**
     * This method will return the size of the linkedList
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * This method will take one element and node which needs to be added to the LinkedList
     * We can add any element after the desired node which we prefer
     * @param elem
     * @param node
     */
    public void addParticularElem(int elem,int node){
        Node curr = head;

        while (curr.data != elem){
            curr = curr.next;
        }
        Node temp = new Node(node);
        temp.next = curr.next;
        curr.next = temp;

        size++;
    }

    public void addBeforeElem(int elem, int node){
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        Node temp = new Node(node);
        temp.next = curr;
        prev.next = temp;

        size++;
    }

    public static void main(String[] args) {
        Practice3 list = new Practice3();

        list.addFirst(4);
        list.addLast(6);
        list.addLast(3);
        list.addLast(8);
        list.addFirst(9);

        list.printList();
        System.out.println(list.getSize());
        list.addParticularElem(3, 7);
        list.addBeforeElem(3, 1);
        list.printList();
    }
}
