package Structural_Patterns.DecoratorPattern;

public class Main {
      public static void main(String[] args) {
            Coffee coffee = new SimpleCoffee(); // coffee is a simple coffee
            System.out.println(coffee.getDesc()); // prints "Simple Coffee"
            coffee = new MilkDecorator(coffee); // coffee is a simple coffee with milk
            System.out.println(coffee.getDesc()); // prints "Simple Coffee, Milk in Coffee"
            coffee = new SugarDecorator(coffee); // coffee is a simple coffee with milk and sugar
            System.out.println(coffee.getDesc()); // prints "Simple Coffee, Milk in Coffee, Sugar in Coffee"
            
      }
}
