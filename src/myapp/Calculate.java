package myapp;

import java.io.Console;

public class Calculate {
    
    public static void main(String[] args) {
        Console cons = System.console();
        
        String input = "";
        Integer total = 0;
        Integer count = 0;

        while (!input.trim().equals("Stop")) {
            input = cons.readLine("Enter a number: ");
            if (!input.trim().equals("Stop")) {
                total += Integer.parseInt(input.trim());
                count++;
            }
        }

        System.out.printf("The total for %d numbers is %d\n", count, total);
    }

}
