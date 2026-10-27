package main.pizza;

public class Order {
    public static final float DELIVERY_FEE = 29.99f;
    private static int orderCount = 0;
    private int id;
    private Pizza pizza;
    private String customer;

    private OrderStatus orderStatus;

    public Order(Pizza pizza, String customer) {
        orderCount++;
        this.id = orderCount;
        this.pizza = pizza;
        this.customer = customer;
        this.orderStatus = OrderStatus.NEW;
    }

    public static int getOrderCount(){
        return orderCount;
    }

    public void pay(){
        if (orderStatus != OrderStatus.NEW){
            System.out.println("Order " + id + " has already been payed for.");
            return;
        }
        orderStatus = OrderStatus.PAYED;
        System.out.println("Order " + id + " is now payed for.");

    }

    public float getTotal(){
        return pizza.getPrice() + DELIVERY_FEE;
    }

    public String toString(){
        return "Order: " + id + ": " + pizza + " till " + customer + " status: " + orderStatus + " " + getTotal() + " kr.";
    }
}
