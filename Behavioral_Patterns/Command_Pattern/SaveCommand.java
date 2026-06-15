package Behavioral_Patterns.Command_Pattern;

public class SaveCommand implements CommandOperation {
      private Text text;
      public SaveCommand(Text text){ // creates command object
            this.text=text;
      }
      public void execute() { // executes the command object
            text.save();
      }
      
}
