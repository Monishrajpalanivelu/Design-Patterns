package Creational_Patterns.BuilderPattern;
// This is the construction phase  of the phone class--> we will set the value one by one
// once  the values are set we return the Phone class object and we cant access anything with the phones object.
public class PhoneBuilder {
      private String os;
      private String processor;
      private int ram;
      private int storage;

      public PhoneBuilder setOs(String os) {
            this.os = os;
            return this;
      }

      public PhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
      }

      public PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
      }

      public PhoneBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
      }

      public Phone build() {
            return new Phone(os, processor, ram, storage);
      }
      
}
