package Exp_03_SOLID;

import Exp_03_SOLID.PaymentServices.Payment;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        String customerName;
        int customerAnswerForPaymentMethod=0;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        OrderBuilder orderBuilder = new OrderBuilder(customerName, scanner);

        //Step 1 : Select Order Items
        orderBuilder.buildOrder();
        Order order = orderBuilder.getOrder();

        //Step2 : Select Payment Method
        System.out.println("Enter Your Payment Method (1 for online and 2 for on-site and 3 for phone):");
        customerAnswerForPaymentMethod = scanner.nextInt();
        Payment payment = PaymentFactory.createPaymentMethod(customerAnswerForPaymentMethod);
        payment.registerUser(customerName);


        //Step3 : pay price
        System.out.println("Pay Price:");
        payment.pay(order.getTotalPrice());


        //Finally Print Bill
        System.out.println(order);


    }

}
