package com.hw.check;

public class Manager extends SingletonAbs{
	

	    private static Manager ins;

	    private Manager() {
	        System.out.println("--- Manager instance created (Singleton) ---");
	    }

	    public static Manager getInstance() {
	        if (ins == null) {
	            ins = new Manager();
	        }
	        return ins;
	    }

	    public void performAction() {
	        System.out.println("Reading and applying global configuration settings.");
	    }
	

}
