package Behavioral_Patterns.Command_Pattern;

public class Main {
      public static void main(String[] args) {
            CommandInvoker commandInvoker = new CommandInvoker();
            commandInvoker.setCommandOperation(new OpenCommand(new Text("text1.txt")));
            commandInvoker.execute(); // opens the file 
            commandInvoker.setCommandOperation(new SaveCommand(new Text("text1.txt")));
            commandInvoker.execute(); // saves the file

      }
}
