package Behavioral_Patterns.Strategy_Pattern;

public class PaymentApp {
      private PaymentStrategy paymentStrategy; // dynamically switching the strategy 
      public void setPaymentStrategy(PaymentStrategy paymentStrategy){
            this.paymentStrategy=paymentStrategy;
      }
      public void pay(int amount){ // dynamically call the correct pay() method
            paymentStrategy.pay(amount);
      }

}
