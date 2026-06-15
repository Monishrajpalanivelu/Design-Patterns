package Behavioral_Patterns.Command_Pattern;

public class OpenCommand implements CommandOperation {
      private Text text;
      public OpenCommand(Text text){ // creates command object
            this.text=text;  
      }
      public void execute() { // executes the command object
            text.open();
      }
}
