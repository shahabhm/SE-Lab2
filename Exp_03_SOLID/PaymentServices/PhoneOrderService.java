package Exp_03_SOLID.PaymentServices;

public class PhoneOrderService implements Payment{
    @Override
    public void registerUser(String customerName) {
        System.out.println("phone order registered for " + customerName);
    }

    @Override
    public void pay(int totalPrice) {
        System.out.println("phone Payment with Price : " + totalPrice + " Tomans!");
    }
}
