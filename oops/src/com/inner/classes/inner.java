package com.inner.classes;

public class inner {
	    public static final String StaticInnerClass = null;
		static int outerStaticField = 10;
	    int outerInstanceField = 20;

	    static void outerStaticMethod() {
	        System.out.println("Outer static method called.");
	    }

	    void outerInstanceMethod() {
	        System.out.println("Outer instance method called.");
	    }

	    static class StaticInnerClass {
	        static int innerStaticField = 30;

	        static void innerStaticMethod() {
	            System.out.println("Inner static method called.");
	            System.out.println("Accessing outer static field: " + outerStaticField);
	            outerStaticMethod(); // Calling outer static method
	            inner outerObj = new inner();
	            System.out.println("Accessing outer instance field via object: " + outerObj.outerInstanceField);
	            outerObj.outerInstanceMethod();
	        }
	    }
	}

