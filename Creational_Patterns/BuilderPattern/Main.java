package Creational_Patterns.BuilderPattern;

public class Main {
      public static void main(String[] args) {
            PhoneBuilder phoneBuilder = new PhoneBuilder();
            Phone phone = phoneBuilder.setOs("Android").setProcessor("Snapdragon").setStorage(128).build();
            System.out.println(phone);
            // using builder we can skip the values and set only the values we want
            Phone phone2 = phoneBuilder.setOs("IOS").setProcessor("A14").setRam(8).build();
            System.out.println(phone2);
            // this is possible because in builder pattern we are not creating the object in builder class 
            // we are creating object in phone class using builder object
            
      }
}
