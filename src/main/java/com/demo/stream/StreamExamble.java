package com.demo.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class StreamExamble {
    public static void main(String[] args) {
        //Create Stream
        Stream<String> stream = Stream.of("Sathish","kumar","manoj");
        stream.forEach(System.out::println);
        //Stream used in Array
        String [] arr ={"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);
        //Stream used in Collection
        Collection<String> collection = Arrays.asList("Sathish","kumar");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);
        //Stream used in List
        List<String> list = Arrays.asList("Sathish","kumar");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);
        //Stream used in Set
        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = list.stream();
        stream4.forEach(System.out::println);
    }
}
