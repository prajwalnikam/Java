package com.abstraction.check;


public class Child extends Data {
 
  public void providesImplementation() {
     System.out.println("--- Method Implementation ---");
     System.out.println(" Child implements the abstract method 'providesImplementation'.");
 }

 public void childAction() {
     System.out.println("Child Action: Running a function unique to this class.");
 }
}