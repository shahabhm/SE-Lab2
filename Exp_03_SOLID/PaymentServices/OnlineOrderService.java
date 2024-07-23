package Exp_03_SOLID.PaymentServices;

public class OnlineOrderService implements Payment {
    @Override
    public void registerUser(String customerName) {
        System.out.println("online order registered for " + customerName);
    }

    @Override
    public void pay(int totalPrice) {
        System.out.println("online order registered for " + totalPrice);
    }
}
