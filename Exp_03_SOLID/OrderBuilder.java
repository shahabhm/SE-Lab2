package Exp_03_SOLID;

import java.util.Scanner;

public class OrderBuilder {
    
    private final Order order;
    private final Scanner scanner;

    public OrderBuilder(String customerName, Scanner scanner) {
        this.scanner = scanner;
        this.order = new Order(customerName);
    }
    
    public void buildOrder() {
        int customerAnswerForOrder=0;
        while (customerAnswerForOrder!=3){
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if(customerAnswerForOrder==1){
                order.addItem(new Food("sandwich",1000));
            } else if(customerAnswerForOrder==2){
                order.addItem(new Food("pizza",2000));
            }
        }
    }

    public Order getOrder() {
        return order;
    }
}
