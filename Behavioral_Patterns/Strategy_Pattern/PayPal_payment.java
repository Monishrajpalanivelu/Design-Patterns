package Behavioral_Patterns.Strategy_Pattern;

public class PayPal_payment implements PaymentStrategy{
      String name;
      public PayPal_payment(String name){
            this.name=name;
      }
      public void pay(int amount){
            System.out.println( name + " is using PayPal to pay " + amount);
      }
      
}
