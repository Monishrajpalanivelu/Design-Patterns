package Creational_Patterns.FactoryPattern;

public class factory  {
      // this is factory class
      // it is used to create objects of different classes
      public os getInstance(String str){
            if (str.equals("Windows")) {
                  return new windows();
            } else if (str.equals("Android")) {
                  return new Andriod();
            } else if (str.equals("IOS")) {
                  return new IOS();
            }
            return null;
      }
}
