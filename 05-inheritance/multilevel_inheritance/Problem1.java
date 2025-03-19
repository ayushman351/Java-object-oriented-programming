package multilevel_inheritance;


class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate){
        this.orderDate=orderDate;
        this.orderId=orderId;
    }

    void getOrderStatus(){
        System.out.println("Your order has placed");
        System.out.println("Order ID: "+orderId+", Order Date: "+orderDate);
    }

}

class ShippedOrder extends Order {
    int trackingNumber;
    ShippedOrder(int trackingNumber, String orderId, String orderDate){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }

    void getOrderStatus(){
        System.out.println("Order ID: "+orderId+", Order Date: "+orderDate+", Tracking Number: "+trackingNumber);
        System.out.println("Your order has been shipped");
    }

}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;    

    DeliveredOrder(String deliverDate, int trackingNumber,String orderId,String orderDate){
        super(trackingNumber, orderId, orderDate);
        this.deliveryDate=deliverDate;
    }

    void getOrderStatus(){
        System.out.println("Order ID: "+orderId+", Order Date: "+orderDate+", Tracking Number: "+trackingNumber+", Delivery Date: "+deliveryDate);
        System.out.println("Your order has been delivered");
    }

}

public class Problem1 {
    public static void main(String[] args) {
        Order order1=new Order("1001", "27 feb 2025");
        Order order2=new ShippedOrder(54252257, "1002", "2 March 2025");
        Order order3=new DeliveredOrder("20 March 2025", 23469723, "1003", "5 March 2025");
        ShippedOrder shippedOrder= new DeliveredOrder("25 March 2025", 2039811, "1007", "10 March 2025");

        order1.getOrderStatus();
        order2.getOrderStatus();
        order3.getOrderStatus();
        shippedOrder.getOrderStatus();
    }
}
