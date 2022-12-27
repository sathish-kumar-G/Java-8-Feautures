package com.demo.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionInterfaceExamble implements BiFunction<Integer, Integer, Integer> {
    public static void main(String[] args) {

        //Normal way
        BiFunction<Integer, Integer, Integer> normal = new BiFunctionInterfaceExamble();
        System.out.println("Normal -> " + normal.apply(5, 10));
        //Anonymous Function
        BiFunction<Integer, Integer, Integer> anonymous = new BiFunction<Integer, Integer, Integer>() {

            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        System.out.println("Anonymous -> "+anonymous.apply(10,20));
        //Using Lambda
        BiFunction<Integer, Integer, Integer> lambda = (a,b) -> (a+b);
        System.out.println("Lambda -> "+lambda.apply(40,22));

    }

    //Implement Method used for normal way
    @Override
    public Integer apply(Integer a, Integer b) {
        return a + b;
    }
}
