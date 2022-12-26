package com.demo.lambda;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("using Runnable interface");
    }
}
public class LambdaRunnableExamble {

    public static void main(String[] args) {
        //Normal
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

//Lambda
        Runnable lambda = () -> {
            System.out.println("using Lambda");
        };
        Thread thread1 = new Thread(lambda);
        thread1.start();
    }
}
