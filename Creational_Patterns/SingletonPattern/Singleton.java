package Creational_Patterns.SingletonPattern;

public class Singleton {
      //  {{ Singeton obj=new Singleton();   }} -->      Eager instantiation
      //  this is not recommended because it will create the object even if it is not used
      private static Singleton instance;
      public static int counter = 0;  //  this counter is just to show that the object is created only once
      private Singleton(){ 
            counter++;
            // made private to prevent direct instantiation
            
      }
      public static Singleton getInstance(){ //  getInstance() --> Lazy instantiation
            //  this is recommended because it will create the object only when it is used
            if(instance == null){
                  instance = new Singleton();  // lazy instantiation
            }
            return instance;
      }
}
