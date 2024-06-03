package main.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class SortingUsingStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 2, 4, 1);
        //functional interface
        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        };
//        List<Integer> sortedList = numbers.stream().sorted(reverseComparator).collect(Collectors.toList());
          //Using lambda
          List<Integer> sortedList = numbers.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
//        List<Integer> sortedList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
//        List<String> names = Arrays.asList("ball", "hockey", "cow", "apple");
//        List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList); // prints [1, 2, 3, 4, 5] or [apple, ball, cow, hockey]
    }
}
