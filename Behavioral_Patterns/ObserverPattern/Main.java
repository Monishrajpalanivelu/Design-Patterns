package Behavioral_Patterns.ObserverPattern;

public class Main {
      public static void main(String[] args) {
            ProductNotifier iphone = new IphoneNotifier("Iphone 18"); // publisher
            CustomerNotifier customer1 = new AmazonUser("balaji"); // subscriber
            CustomerNotifier customer2 = new AmazonUser("ajith"); // subscriber
            CustomerNotifier customer3 = new AmazonUser("arun"); // subscriber
            iphone.subscribe(customer1); // subscribing to the publisher
            iphone.subscribe(customer2); // subscribing to the publisher
            iphone.subscribe(customer3); // subscribing to the publisher
            iphone.notifyCustomers("Iphone is now available"); // notifying all the subscribers
            iphone.unsubscribe(customer2); // unsubscribing from the publisher
            iphone.notifyCustomers("Iphone is now available"); // notifying all the subscribers

      }
}
