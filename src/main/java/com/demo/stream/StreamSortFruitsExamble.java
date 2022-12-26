package com.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortFruitsExamble {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Apple");

        //Ascending Order
          //Type -1
        list.stream().sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

          //Type-2
         list.stream().sorted(Comparator.naturalOrder())
                 .collect(Collectors.toList())
                 .forEach(System.out::println);

         //Type-3
        list.stream().sorted((o1,o2)-> o1.compareTo(o2))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Descending Order
           //Type -1
            list.stream().sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList())
                    .forEach(System.out::println);

            //Type -2
            list.stream().sorted((o1,o2)->o2.compareTo(o1))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
    }
}
