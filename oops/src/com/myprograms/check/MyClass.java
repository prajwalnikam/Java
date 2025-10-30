package com.myprograms.check;

public class MyClass {

	{
        System.out.println("Inside non-static block.");
        AnotherClass anotherObject = new AnotherClass(); 
        anotherObject.doSomething();
    }

   public MyClass(){
        System.out.println("Inside MyClass constructor.");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); 
        }
}
