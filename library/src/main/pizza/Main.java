package main.pizza;

public class Main {
    static void main(String[] args) {
        Pizza kebabPizza = new Pizza("Kebab Pizza" , 121);

        System.out.println("Previous orders: " + Order.getOrderCount());

        Order order1 = new Order(kebabPizza, "Robert");
        Order order2 = new Order(kebabPizza, "Ida");

        System.out.println("Current orders: " + Order.getOrderCount());

        order1.pay();
        order2.pay();
        order1.pay();

        System.out.println(order1);
        System.out.println(order2);
    }
}


