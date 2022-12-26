package com.demo.lambda.functionalinterface;

import java.util.function.Function;

class FunctionImpl implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
public class FunctionalinterfaceExamble {

    public static void main(String[] args) {
        // Normal case
        Function<String,Integer> fi = new FunctionImpl();
        System.out.println(fi.apply("sathish"));

        // using Lambda
        Function<String,Integer> fi1 = (s -> s.length());
        System.out.println(fi1.apply("sathish"));
    }
}
