import java.util.ArrayList;

public class SubarrProd {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(countSubArrayProductLessThanK(list, 10));
    }

    static int countSubArrayProductLessThanK(ArrayList<Integer> arr, long k){
        int n = arr.size();
        long p = 1;
        int res = 0;
        for (int start = 0, end = 0; end < n; end++) {
 
            // Move right bound by 1 step.
            // Update the product.
            p *= arr.get(end);
 
            // Move left bound so guarantee that
            // p is again less than k.
            while (start < end && p >= k)
                p /= arr.get(start++);
 
            // If p is less than k, update the counter.
            // Note that this is working even for
            // (start == end): it means that the
            // previous window cannot grow anymore
            // and a single array element is the only
            // addendum.
            if (p < k) {
                int len = end - start + 1;
                res += len;
            }
        }
 
        return res;
    }
}
