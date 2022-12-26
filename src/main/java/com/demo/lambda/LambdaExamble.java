package com.demo.lambda;

interface Addition{
    int add(int a, int b);


}



public class LambdaExamble {



    public static void main(String [] args){
        System.out.println("hello-world");
        // Lambda
        FunctionalInterface demo = () -> System.out.println("Lambda Expression");
    //    demo.draw();

        demoMethod(demo);

        //Lambda using Parameters
        Addition adds = (a,b) -> (a+b);
        System.out.println(adds.add(12,12));



    }
    private static void demoMethod(FunctionalInterface demo){
        demo.draw();
    }
}
