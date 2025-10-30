package com.abstraction.check;

public class GrandChild extends Child {


 public void grandchildAction() {
     System.out.println("Grandchild Action: Executing a specialized function.");
 }

  public static void main(String[] args) {
     System.out.println("🚀 Program Starting...");
     
          GrandChild gc = new GrandChild();
          

     System.out.println("\n--- Inherited Methods Execution ---");
     gc.printInfo();
     gc.providesImplementation();
     gc.childAction();
     gc.grandchildAction();
     
     System.out.println("\n--- Specific Methods Execution ---");
     
     System.out.println("---------------------------------");
     System.out.println("Program Finished.");
 }
}