package Exp_03_SOLID.PaymentServices;

public class OnSiteOrderService implements Payment {
    @Override
    public void registerUser(String customerName) {
        System.out.println("on-Site order registered for " + customerName);
    }

    @Override
    public void pay(int totalPrice) {
        System.out.println("on-Site Payment with Price : " + totalPrice + " Tomans!");
    }
}
