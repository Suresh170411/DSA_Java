import java.util.Stack;

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

    public void deleteParticular(String elem){
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
    }

    public void deleteAfter(String elem){
        Node curr = head;
        
        while (curr.data != elem){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    
    /**
     * The function checks if a linked list is a palindrome by using a stack to store the elements and
     * comparing them with the original linked list.
     * 
     * @return The method is returning a boolean value. It returns `true` if the linked list is a
     * palindrome (i.e., reads the same forwards and backwards), and `false` otherwise.
     */
    public boolean bestApproach(){
        Stack<String> st = new Stack<>();

        Node curr = head;
        while (curr != null){
            st.push(curr.data);
            curr = curr.next;
        }
        
        Node temp = head;
        
        while (temp != null){
            if (temp.data != st.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args){
        Palindrome list = new Palindrome();

        list.addFirst("n");
        list.addLast("a");
        list.addLast("m");
        list.addLast("a");
        list.addLast("n");

        // list.addAfterNode("m", "k");

        boolean result = list.printList().equals(list.reverseList());

        if (result){
            System.out.println("THIS IS A PALINDROME");
        }else {
            System.out.println("THIS IS NOT A PALINDROME");
        }

        System.out.println(list.bestApproach());
    }
}
