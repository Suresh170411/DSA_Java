public class Practice5{
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
     * This method will add one node to the begining of the LL
     * @param node
     */
    public void addFirst(int node){
        Node newNode = new Node(node);

        if (head == null){
            head = newNode;
        }else{
            newNode.next = head;
        head = newNode;
        }
        size++;
    }

    /**
     * This method will print the elements of LinkedList
     */
    public void printList(){
        Node current = head;

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * This method will add one node to the end of the LL
     * @param data
     */
    public void addLast(int data){
        Node newNode = new Node(data);

        Node curr = head;

        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

        size++;
    }

    /**
     * This method will add one element after the desired node
     * @param elem
     * @param node
     */
    public void addAfterNode(int elem, int node){
        Node newNode = new Node(node);
        Node curr = head;
        while (curr.data != elem){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        size++;
    }

    /**
     * This method will add one node before the desired node
     * @param elem
     * @param node
     */
    public void addBeforeNode(int elem, int node){
        Node newNode = new Node(node);
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;

        size++;
    }

    /**
     * This method will delete one node after the desired node
     * @param elem
     */
    public void deleteAfterNode(int elem){
        Node curr = head;

        while (curr.data != elem){
            curr = curr.next;
        }
        curr.next = curr.next.next;

        size--;
    }

    /**
     * This method will delete one node before the desired node
     * @param elem
     */
    public void deleteBeforeNode(int elem){
        Node curr = head;
        Node prev = null;
        Node secondPrev = null;

        while (curr.data != elem){
            secondPrev = prev;
            prev = curr;
            curr = curr.next;
        }
        secondPrev.next = prev.next;
        size--;
    }

    /**
     * This method will delete any particular node we want
     * @param elem
     */
    public void deleteParticular(int elem){
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        size--;
    }


    /**
     * This method will return the list size
     * @return
     */
    public int getSize(){
        return size;
    }


    /**
     * This method will reverse the LinkedList
     */
    public void reverseSLL(){
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
    

    /**
     * This method will find the middle node by using the size of the LinkedList
     */
    public void findMiddleNode(){
        Node curr = head;
        int size = getSize();

        if (size == 1){
            System.out.println(curr.data);
        }else {
            if (size%2 != 0){
                for (int i=0; i<size/2; i++){
                    curr = curr.next;
                }
                System.out.println(curr.data);
            }else {
                for (int i=0; i<size/2-1; i++){
                    curr = curr.next;
                }
                System.out.println(curr.data);
            }
        }
    }


    /**
     * This method will print the Nth node in a LinkedList using size of LL
     * @param n
     */
    public void findNthNode(int n){
        Node curr = head;
        if (n >= getSize()){
            System.out.println("Invalid Index");
        }else {
            for (int i=0; i<n; i++){
                curr = curr.next;
            }
            System.out.println(curr.data);
        }
    }

    /**
     * This method uses 2 pointers to find the middle node of a LL --> suitable for ODD size
     */
    public void findMiddleNodeUsingTP(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }


    /**
     * This method will find the middle node of LL using 2 pointers --> suitable for EVEN size
     */
    public void findMiddleEvenNode(){
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(prev.data);
    }

    public static void main(String[] args) {
        Practice5 list = new Practice5();

        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(8);

        list.printList();
        // list.reverseSLL();

        list.findMiddleNodeUsingTP();
        list.findMiddleEvenNode();
    }
}