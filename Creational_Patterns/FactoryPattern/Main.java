package Creational_Patterns.FactoryPattern;

public class Main {
      /* Wrong design -> user can see your classes and objects 
       * os obj1 =new IOS();
       * os obj2 =new Andriod();
       * os obj3 =new windows();
       * if you create a new os then you have to change the code in main()
       * this is not good -> we use factory pattern
       */
      
      public static void main(String[] args) {
            // factory design pattern
            factory obj = new factory();
            os ob1=obj.getInstance("IOS");
            ob1.spec();
            os ob2=obj.getInstance("Android");
            ob2.spec();
            os ob3=obj.getInstance("Windows");
            ob3.spec();
            



      }
}
