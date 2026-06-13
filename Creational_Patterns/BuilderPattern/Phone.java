package Creational_Patterns.BuilderPattern;

public class Phone {
      private String os;
      private String processor;
      private int ram;
      private int storage;

      public Phone(String os, String processor, int ram, int storage) {
            this.os = os;
            this.processor = processor;
            this.ram = ram;
            this.storage = storage;
      }
      @Override
      public String toString(){
            return "Phone [os=" + os + ", processor=" + processor + ", ram=" + ram + ", storage=" + storage + "]";
      }
      
}
