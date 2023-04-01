public class MaxOneCount {
    public static void main(String[] args) {
        int arr [] = {1,1,2,4,1,1,1,1,4,5};
        countConsicutiveOne(arr);
        optimizedSolution(arr);
    }
    public static void countConsicutiveOne(int arr []){
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            int count = 0;
            for (int j=i; j<n; j++){
                if (arr[j] == 1){
                    count++;
                }else {
                    break;
                }
            }
            if (count > max){
                max = count;
            }
        }
        System.out.println(max);
    }

    public static void optimizedSolution(int arr []){
        int n = arr.length;

        int oneCount = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i=0; i<n; i++){
            if (arr[i] != 1) {
                oneCount = 0;
            }else{
                oneCount++;

                if (oneCount > max){
                    max = oneCount;
                }
            }
        }
        System.out.println(max);
    }
    
}
