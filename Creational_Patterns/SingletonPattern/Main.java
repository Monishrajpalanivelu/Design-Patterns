package Creational_Patterns.SingletonPattern;

public class Main {
      public static void main(String[] args) {
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();
            Singleton s3 = Singleton.getInstance();
            System.out.println(s1 == s2);
            System.out.println(s2 == s3);
            System.out.println(s1 == s3);
            System.out.println(s1.counter);
            System.out.println(s2.counter);
            System.out.println(s3.counter);
      }
}
