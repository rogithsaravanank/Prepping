#### This Java program demonstrates how to filter duplicate objects from a list using a Set and Java Streams. The program defines an Order class with fields for orderId, name, product, and location. Two Order objects are considered duplicates if they share the same name, product, and location, regardless of their orderId.

```
import java.util.*;
import java.util.stream.Collectors;

public class Caterpillar {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1,"Sasi","Product1","Location"));
        orderList.add(new Order(2,"Sasi","Product1","Location"));
        orderList.add(new Order(3,"Sasi","Product2","Location"));
        orderList.add(new Order(4,"Sasi","Product1","Location"));

       System.out.println(orderList.stream().collect(Collectors.toSet()));



    }



}

class Order
{
    int orderId;
    String name;
    String product;
    String location;

    public Order(int orderId, String name, String product, String location) {
        this.orderId = orderId;
        this.name = name;
        this.product = product;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(name, order.name) && Objects.equals(product, order.product) && Objects.equals(location, order.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, product, location);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
```