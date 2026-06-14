package Structural_Patterns.DecoratorPattern;

public class MilkDecorator extends CoffeDecorator{
      private Coffee coffee;  // object of either simple coffee or cold coffee
      public MilkDecorator(Coffee coffee){
            super(coffee); // calls the constructor of parent class (tells the type of object)
            this.coffee = coffee; // assigns the object to this.coffee
      }
      public String getDesc(){   // this method is overridden from Coffee interface and coffeDecorator class
            return coffee.getDesc()+" , Milk in Coffee"; // calls the parent class's getDesc method (object's method)
      }
      
}
