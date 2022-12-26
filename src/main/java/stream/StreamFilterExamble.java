package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Product Entity
class Product{
    int id;
    String name;
    int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class StreamFilterExamble {
    public static void main(String[] args) {

        //Normal Way Operation
        List<Product> products = new ArrayList<Product>();
        //For each loop is used to check the condition
        for(Product product:products()){
            if(product.getPrice()>6000){
                products.add(product);
            }
        }
        //for each loop is used to print the Result
        for(Product product: products){
            System.out.println(product);
        }

        //Stream Filter case
      //List<Product> products1 =
              products().stream()
                .filter((product) ->product.getPrice()<21000)
                .collect(Collectors.toList()).forEach(System.out::println);
      //  products1.forEach(System.out::println);

    }

    //Static method used to set the values
    static List<Product> products(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"Car",50000));
        products.add(new Product(2,"Cycle",5000));
        products.add(new Product(3,"Bike",20300));
        products.add(new Product(4,"House",5000000));
        return products;
    }
}
