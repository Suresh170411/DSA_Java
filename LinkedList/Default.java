import java.util.LinkedList;

public class Default {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.addFirst(5);

        System.out.println(list);

        System.out.println(list.size());

        // for printing the default linkedlist nodes
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        // for searching purpose we can do that by following way  
        // if (list.get(i) == value)  -- > inside the for loop

        list.removeFirst();

    }
}
