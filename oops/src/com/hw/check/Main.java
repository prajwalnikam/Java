package com.hw.check;

public class Main {
	
	public static void main(String[] args) {

        System.out.println("--- Starting main Application ---");

        Manager manager1 = Manager.getInstance();
        manager1.performAction();

        Manager manager2 = Manager.getInstance();
        manager2.performAction();

        System.out.println("\nVerification:");
        System.out.println("Manager 1 HashCode: " + manager1.hashCode());
        System.out.println("Manager 2 HashCode: " + manager2.hashCode());

        if (manager1 == manager2) {
            System.out.println("\nResult: References are EQUAL. Only one instance exists.");
        } else {
            System.out.println("\nResult: References are DIFFERENT. Singleton failed.");
        }
        System.out.println("--- Application Finished ---");
    }

}
