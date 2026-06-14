package Creational_Patterns.AdapterPattern;

public class PenAdapter implements Pen {
      private PilotPen pilotPen;
      public PenAdapter(PilotPen pilotPen){
            this.pilotPen = pilotPen;
      }
      public void write(String str){ // method of pen interface
            
            pilotPen.mark(str); // method of pilot pen class

            // now pilot pen is converted to pen
            
      }
}
