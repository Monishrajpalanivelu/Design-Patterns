package Behavioral_Patterns.ObserverPattern;

// Observer (subscriber) 
public class AmazonUser implements CustomerNotifier{
      String name;

      public AmazonUser(String name){
            this.name=name;
      }
      public void notify(String msg){  // recieves notification from the publisher and doesnt needs to check for the update on their own
            System.out.println("Hey " + name + ", " + msg);
      }
      
}
