package Exp_03_SOLID.PaymentServices;

public interface Payment {

    void registerUser(String customerName);

    void pay(int totalPrice);
}
