package com.hw.check;

public abstract class Computer extends AbsInheritance{

public abstract void loadOS();
     
    public void checkStatus() {
        System.out.println("-> COMPUTER STATUS: Running hardware diagnostics...");
    }
}
