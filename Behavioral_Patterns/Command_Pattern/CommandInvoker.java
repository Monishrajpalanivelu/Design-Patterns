package Behavioral_Patterns.Command_Pattern;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {  // executes different type of commands 
      private CommandOperation commandOperation; // it holds the reference to the strategy object
      List<CommandOperation> commandOperationList = new ArrayList<>(); 
      public void setCommandOperation(CommandOperation commandOperation){  // it sets the command object
           
            this.commandOperation=commandOperation;
      }
      public void execute(){  // it executes the command object dynamically
            commandOperation.execute();
      }
}
