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
        size--;
    }

    public void deleteLast(){
        Node curr = head;
        Node secondLast = null;

        if (head == null){
            System.out.println("List is Empty !");
            return;
        }

        while (curr.next != null){
            secondLast = curr;
            curr = curr.next;
        }
        secondLast.next = null;
        size--;
    }

    public void deleteParticular(int elem){
        Node curr = head;
        Node prev = null;

        if (curr == null){
            System.out.println("List is Empty !");
            return;
        }

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        size--;
    }

    public void deleteNodeBefore(int elem){
        Node curr = head;
        Node prev = null;
        Node prePrev = null;

        if (curr == null){
            System.out.println("List is Empty !");
            return;
        }

        while (curr.data != elem){
            prePrev = prev;
            prev = curr;
            curr = curr.next;
        }
        prePrev.next = curr;
        size--;
    }

    public void deleteNodeBefore2(int elem){
        Node curr = head;
        Node prev = null;

        if (curr == null){
            System.out.println("List is Empty !");
            return;
        }

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        deleteParticular(prev.data);
        size--;
    }

    public void deleteAfterNode(int elem){
        Node curr = head;

        if (curr == null){
            System.out.println("List is Empty !");
            return;
        }

        while (curr.data != elem){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    public void deleteAfterNode2(int elem){
        Node curr = head;

        if (curr == null){
            System.out.println("List is Empty !");
            return;
        }

        while (curr.data != elem){
            curr = curr.next;
        }
        deleteParticular(curr.next.data);
        size--;
    }

    public void reverseLinkedList(){
        
        Node curr = head;
        Node prev = null;
        Node nextP = null;

        while (curr != null){
            nextP = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextP;
        }
        head = prev;
        printList();
      }

    
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Practice4 list = new Practice4();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.printList();
        // System.out.println(list.isPresent(5));
        list.deleteAfterNode2(3);
        list.printList();
        list.reverseLinkedList();
    }
}
