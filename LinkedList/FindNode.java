public class FindNode{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
        }
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
    }

    public void printList(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+ " ");
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

    public void findKthNodeFromEnding1(int K){
        Node curr = head;
        int count = 0;
        while (curr.next != null){
            count++;
            curr = curr.next;
        }

        Node temp = head;
        for (int i=0; i<count-K+1; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void findKthNodeFromEnding2(int K){
        // reversing list and then finding Kth Node
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

        Node temp = head;
        for (int i=1; i<K; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    /** 
     * Using smart approach
     */
    public void findKthNodeFromEnding3(int K){

        Node p = head;  // first pointer
        Node q = head;  

        for (int i=1; i<K; i++){  // second pointer start from Kth position
            p = p.next;
        }

        while (p.next != null){
            p = p.next;
            q = q.next;
        }
        System.out.println(q.data);
    }
    public static void main(String[] args) {
        FindNode list = new FindNode();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();
        
        list.findKthNodeFromEnding1(1);
        list.findKthNodeFromEnding2(1);
        list.printList();
        list.reverseList();
        list.findKthNodeFromEnding3(1);
    }
}