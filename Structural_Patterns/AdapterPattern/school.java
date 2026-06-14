package Structural_Patterns.AdapterPattern;

public class school {
      public static void main(String[] args) {
            AssignmentWork assignmentWork = new AssignmentWork();
            Pen pen = new PenAdapter(new PilotPen()); // i am creating an adapter and passing pilot pen to it
            // the adapter will convert pilot pen to pen 
            assignmentWork.setPen(pen); // then i am setting the adapter to assignment work
            assignmentWork.writeAssignment("I am writing assignment");
      }
}
