package Structural_Patterns.DecoratorPattern;

public class SugarDecorator extends CoffeDecorator{
      private Coffee coffee;   // object of parent class may be a simple coffee or a cold coffee
      public SugarDecorator(Coffee coffee){
            super(coffee);  // calls the constructor of parent class (tells the type of object)
            this.coffee = coffee;  // assigns the object to this.coffee
      }
      public String getDesc(){
            return coffee.getDesc()+" , Sugar in Coffee";  // calls the parent class's getDesc method (object's method)
      }
      
}
