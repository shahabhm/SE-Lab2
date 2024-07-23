package Exp_03_SOLID;

import Exp_03_SOLID.PaymentServices.OnSiteOrderService;
import Exp_03_SOLID.PaymentServices.OnlineOrderService;
import Exp_03_SOLID.PaymentServices.PhoneOrderService;
import Exp_03_SOLID.PaymentServices.Payment;

public class PaymentFactory {

    public static Payment createPaymentMethod(int $customerAnswer) throws Exception {
        if($customerAnswer==1){
            return new OnlineOrderService();
        } else if($customerAnswer==2){
            return new OnSiteOrderService();
        } else if($customerAnswer==3){
            return new PhoneOrderService();
        }
        throw new Exception("invalid answer");
    }
}
