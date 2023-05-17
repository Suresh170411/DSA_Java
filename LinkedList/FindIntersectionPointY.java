public class FindIntersectionPointY {
    class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void add(int data){
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

    public void print(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    /**
     * This Java function returns the length of a linked list by iterating through each node and
     * incrementing a counter.
     * 
     * @return The method `getLength()` returns an integer value which represents the length of the
     * linked list.
     */
    public int getLength(){
        Node curr = head;
        int len =0;

        while (curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }

    /**
     * This function finds the data value of the node where two linked lists intersect, given the
     * difference in length between the two lists and the starting nodes of each list.
     * 
     * @param diff The difference in length between two linked lists.
     * @param node1 The first node in a linked list.
     * @param node2 The "node2" parameter is a reference to a Node object, which is likely a node in a
     * linked list data structure. The method is using this parameter to find the intersection point of
     * two linked lists.
     * @return The data of the node where node1 and node2 intersect.
     */
    public int find(int diff, Node node1, Node node2){
        for (int i=0; i<diff && node1 != null; i++){
            node1 = node1.next;
        }
        while (node1 != node2){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1.data;
    }

    public static void main(String[] args) {
        FindIntersectionPointY list1 = new FindIntersectionPointY();

        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(4);

        list1.print();

        FindIntersectionPointY list2 = new FindIntersectionPointY();

        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.head.next.next.next = list1.head.next.next;
        list2.head.next.next.next.next = list1.head.next.next.next;

        list2.print();

        int len1 = list1.getLength();
        int len2 = list2.getLength();

        int diff = Math.abs(len1 - len2);

        int res = len1 > len2 ? list1.find(diff, list1.head, list2.head) : list2.find(diff, list2.head, list1.head);

        System.out.println(res);
    }
}
