package methodRef;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;


//Interface is used for Instance of an Object method
@FunctionalInterface
interface Print{
    void print(String msg);
}
public class MethodReferenceExamble {
    //Custom Static method
    static int addition(int a, int b){
        return a+b;
    }
    //Instance of an Object method
    String display(String msg){
        System.out.println(msg);
        return msg;
    }
    public static void main(String[] args) {

        //1.Static method
        //Lambda expression
        Function<Integer,Double> function = (a) -> Math.sqrt(a);
        System.out.println(function.apply(25));
        //Method Reference
        Function<Integer,Double> methodRefernce = Math::sqrt;
        System.out.println(methodRefernce
                .apply(49));
        //Custom Static Method used lambda
        BiFunction<Integer,Integer,Integer> a = (z,b)-> MethodReferenceExamble.addition(z,b);
        System.out.println(a.apply(13,7));
        //Custom Static Method used Method Reference
       BiFunction<Integer,Integer,Integer> a1 = MethodReferenceExamble::addition;
        System.out.println(a1.apply(4,2));

        //2.Method Reference to an Instance of an Object
            //Create Instance
            MethodReferenceExamble methodReferenceExamble =  new MethodReferenceExamble();
            //Lambda
             Print p = (msg -> methodReferenceExamble.display(msg));
                  p.print("Hello");
                  //Method Reference
               Print p1 = methodReferenceExamble::display;
               p1.print("Haii");

        //3.Reference to an instance method of sn arbitrary Object
           //ex: some time use argument in lambda, that case it is used
              //Lambda
               Function<String,String> ref = (input) ->input.toLowerCase();
        System.out.println(ref.apply("SATHISH"));
               //Method Reference
                 Function<String,String> ref1 = String::toLowerCase;
        System.out.println(ref.apply("KUMAR"));

        //4. Reference Used in Constructor
             List<String> fruits = new ArrayList<>();
             fruits.add("Mango");
             fruits.add("Apple");
             fruits.add("Mango");
        System.out.println(fruits);
           //Lambda
               Function<List<String>, Set<String>> cons = (fruit) -> new HashSet<>(fruit);
                 System.out.println(cons.apply(fruits));
            //Method Reference
                Function<List<String>, Set<String>> cons1 = HashSet::new;
                 System.out.println(cons.apply(fruits));
    }


}
