package Behavioral_Patterns.Strategy_Pattern;

public class Gpay_Payment implements PaymentStrategy{  // Observer (subscriber) 
      String name;
      public Gpay_Payment(String name){
            this.name=name;
      }
      public void pay(int amount){  // recieves notification from the publisher and doesnt needs to check for the update on their own
            System.out.println( name + " is using Gpay to pay " + amount);
      }
}
