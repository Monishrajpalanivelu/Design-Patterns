package Behavioral_Patterns.ObserverPattern;
import java.util.*;
public class IphoneNotifier implements ProductNotifier{
      String name;
      public IphoneNotifier(String name){
            this.name=name;
}
      List<CustomerNotifier> list=new ArrayList<>();
      public void subscribe(CustomerNotifier customer){
            list.add(customer);
      }
      public void unsubscribe(CustomerNotifier customer){
            list.remove(customer);
      }
      public void notifyCustomers(String msg){  // this is the observer pattern implementation
            for(CustomerNotifier customer : list){
                  customer.notify(msg); // notifies all the subscribers
            }
      } 
      
}
