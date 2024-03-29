package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<String> words = Arrays.asList("cat","dog","bird","elephant");

        List<String> fruits = Arrays.asList("apple","orange","chrry","banana");

        
    }

    // This function will take one list and will give the sum of the EVEN elements
    // using Stream API
    public static int getEvenSum(List<Integer> list){
        int sum = list.stream()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(n -> n)
                    .sum();

        return sum;
    }

    // this function takes one list and return the total sum
    public static int getTotalSum(List<Integer> list){
        int sum = list.stream()
                    .mapToInt(n->n)
                    .sum();

        return sum;
    }


    // this method takes one list and return odd element in another list
    public static List<Integer> getOddElements(List<Integer> list){

        List<Integer> filteredList = list.stream()
                                        .filter(s -> s%2 != 0)
                                        .collect(Collectors.toList());
        
        return filteredList;
    }

    // this method will print 0-9 just like for loop
    public static void printElements(){
        Stream.iterate(0, n-> n+1)
                .limit(10)
                .forEach(s -> System.out.print(s+" "));
        System.out.println();
    }


    // this method will take on list of String and will return first foung match
    public static String getFirstWord(List<String> list){
        String result = list.stream()
                            .filter(s -> s.length() > 3)
                            .findFirst()
                            .orElse("No words found !");

        return result;
    }


    // this method will append all the words inside the list into Upper Case
    public static String appendToUpperCase(List<String> list){
        String result = list.stream()
                            .map(w -> w.toUpperCase())
                            .reduce("", (a,b) -> a+b);
        
        return result;
    }

    // this methos will take one list and append it with "-" separator
    public static void useReduceMethod(List<String> list){

            Optional<String> result = list.stream()
                                        .reduce((s1, s2)-> s1 + "-" + s2);
            
            if (result.isPresent()){
                System.out.println(result.get());
            }
    }

    public static void applyFunction(int num){
        Function<Integer,Integer> addOne = x -> x+1;    // first it will take 3+1 = 4
        Function<Integer,Integer> doubleIt = x -> x*2;  // then it will take 4*2 = 8
        Function<Integer,Integer> squareIt = x -> x*x;  // it will make the sq of it 8*8 = 64

        int result = addOne
                    .andThen(doubleIt)
                    .andThen(squareIt)
                    .apply(num);

        System.out.println(result); // result will be 64
    }

    public static void applyFunc(int num){
        Function<Integer,Integer> addOne = x -> x+1;
        Function<Integer,Integer> square = x -> x*x;

        int result = addOne.compose(square).apply(num);

        System.out.println(result); // ans --> 5
    }


    // This method will take a list and return sum of all the elements
    public static int reduceMethod(List<Integer> list){
        int result = list.stream()
                        .reduce(0, (a,b) -> a+b);
        
        return result;
    }

}
