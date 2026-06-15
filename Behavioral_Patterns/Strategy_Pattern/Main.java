package Behavioral_Patterns.Strategy_Pattern;

public class Main {
      public static void main(String[] args){
            PaymentApp paymentApp = new PaymentApp();
            paymentApp.setPaymentStrategy(new PayPal_payment("kane"));
            paymentApp.pay(100);
            paymentApp.setPaymentStrategy(new Gpay_Payment("kane"));
            paymentApp.pay(200);
      }
}
