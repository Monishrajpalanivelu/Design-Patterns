package Structural_Patterns.AdapterPattern;

public class AssignmentWork {
      private Pen pen;
      public void setPen(Pen pen){
            this.pen = pen;
      }
      public void writeAssignment(String str){
            pen.write(str);
            // to write assignment i want a pen but i have pilot pen which is not compatible with my assignment work
            // so i need to use adapter to convert pilot pen to pen
            
      }
}
