package com.oop;

public class EncapsulationMyMethod {
/*    We have 4 Access modifiers
      public
      default(package visible)
      protected
      private
*/
    private String s = "Hello World";

    public String getS(){
        return s;
    }

    public void setS(String newValue){
        s = newValue;
    }


}
