import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecifiedIndex {
    public static void main(String[] args) {
        int arr [] = {1,2,4,5,6};
        Integer [] res = {1,2,4,5,6};

        int x = 50;
        int pos = 3;

        insertIntoSpecifiedIndex(arr, x, pos);
        insertUsingCollections(res, x, pos);
    }

    /**
        1.First get the element to be inserted, say element
        2.Then get the position at which this element is to be inserted, say position
        3.Convert array to ArrayList
        4.Add element at position using list.add(position, element)
        5.Convert ArrayList back to array and print
     */

    public static void insertIntoSpecifiedIndex(int arr [], int x, int pos){
        int res [] = new int [arr.length+1];

        for (int i=0; i<arr.length+1; i++){
            if (i < pos){
                res[i] = arr[i];
            }else if (i == pos){
                res[i] = x;
            }else {
                res[i] = arr[i-1];
            }
        }
        
        System.out.println(Arrays.toString(res));
    }

    public static void insertUsingCollections(Integer arr [], int x, int pos){
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.add(pos, x);

        arr = list.toArray(arr);

        System.out.println(list);
    }
}
