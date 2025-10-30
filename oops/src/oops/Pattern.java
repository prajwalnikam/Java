package oops;



public class Pattern {
    public static void main(String[] args) {
        // Outer loop controls number of pattern blocks
        for (int i = 1; i <= 4; i++) {
            System.out.println("*"); // print single star line every time
            
            // Inner loop prints increasing number of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }
}

