package Behavioral_Patterns.ObserverPattern;

public interface ProductNotifier {
      public void notifyCustomers(String msg);
      public void subscribe(CustomerNotifier customer);
      public void unsubscribe(CustomerNotifier customer);
      
}
