package Structural_Patterns.DecoratorPattern;

public class CoffeDecorator implements Coffee{
      private Coffee coffee;
      public CoffeDecorator(Coffee coffee){
            this.coffee = coffee;
      }
      public String getDesc(){
            return coffee.getDesc();
            
      }
      
}
