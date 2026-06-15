package Behavioral_Patterns.Command_Pattern;

public class Text { // this is the reciever class in command pattern 
      private String text;
      public Text(String text){  // recieves the command object
            this.text = text;
      }
    public void open(){ //    recieves the command from command invoker 
      System.out.println(text+" is opened");
    }
    public void save(){ // recieves the command from command invoker 
      System.out.println(text+" is saved");
    }
}
