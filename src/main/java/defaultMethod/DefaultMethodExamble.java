package defaultMethod;

//Interface have Abstract and default method
interface Vechile{
    //abstract method
    String brand();
    String type();
    String model();

    //Default Method
    default String name(){
       return "Audi-007";
    }

    default String color(){
       return "Pink";
    }

    //Static Method
    static String company(){
        return "Audiiiiiiii";
    }
}

//Implement Class
class Car implements Vechile{

    @Override
    public String brand() {
        return "Audi";
    }

    @Override
    public String type() {
        return "Petrol";
    }

    @Override
    public String model() {
        return "audi";
    }
}
public class DefaultMethodExamble {

    public static void main(String[] args) {
        //Create Instance
        Car car = new Car();
        //Abstract Method
        System.out.println(car.brand());
        System.out.println(car.model());
        System.out.println(car.brand());
        //Default Method
        System.out.println(car.name());
        System.out.println(car.color());
        //Static Method
        System.out.println(Vechile.company());
    }
}
