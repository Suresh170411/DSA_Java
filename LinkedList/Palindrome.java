public class Palindrome {
    class Node {
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(String data){
        Node node = new Node(data);

        if (head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    public void addLast(String data){
        Node node = new Node(data);

        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
    }

    public String printList(){
        Node curr = head;
        String bag = "";
        while (curr != null){
            bag+= curr.data;
            curr = curr.next;
        }
        return bag;
    }

    public String reverseList(){
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

        return printList();
    }

    public static void main(String[] args){
        Palindrome list = new Palindrome();

        list.addFirst("n");
        list.addLast("a");
        list.addLast("m");
        list.addLast("a");
        list.addLast("n");

        boolean result = list.printList().equals(list.reverseList());

        if (result){
            System.out.println("THIS IS A PALINDROME");
        }else {
            System.out.println("THIS IS NOT A PALINDROME");
        }
    }
}
