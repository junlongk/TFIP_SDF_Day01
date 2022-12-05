package workshop;

import java.io.Console;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    
    public static void main(String[] args) {
        Console cons = System.console();

        List<String> shoppingCart = new LinkedList<>();

        String input = "";

        System.out.println("Welcome to your shopping cart");
        input = cons.readLine("> ").trim();

        while (!input.equals("exit")) {
            if (input.equals("list")) {
                if (shoppingCart.size() == 0) {
                    System.out.println("Your cart is empty");
                    input = cons.readLine("> ").trim();
                } else {
                    for (Integer index = 0; index < shoppingCart.size(); index++) {
                        System.out.printf("%d. %s\n", index + 1, shoppingCart.get(index));
                    }
                    input = cons.readLine("> ").trim();
                }
            } else if (input.contains("add")) {
                String item = input.split(" ")[1];
                shoppingCart.add(item);
                System.out.printf("%s added to cart\n", item);
                input = cons.readLine("> ").trim();
            } else if (input.contains("delete")) {
                Integer removeIndex = Integer.parseInt(input.split(" ")[1]) - 1;
                System.out.printf("%s removed from cart\n", shoppingCart.get(removeIndex));
                shoppingCart.remove((int)removeIndex);
                input = cons.readLine("> ").trim();
            } else {
                input = cons.readLine("Please enter a valid command!\n> ").trim();
            }
        }

        System.out.println("Thank you for shopping with us!");
    }

}

/*
 
Console cons = System.console();
List<String> cart = new LinkedList<>();
Boolean stop = false;

while (!stop) {
    // list
    // add <item>
    // delete <num>
    // exit
    String line = cons.readLine("> ");
    // command line delimited by space
    line = line.trim();
    // add apple => ["add", "apple"]
    // list => ["list"]

    String[] terms = line.split(" ");

    switch (terms[0]) {
        case "list":
            if (cart.size() <= 0) {
                System.out.println("Your cart is empty");
            } else {
                System.out.println("The contents of your cart");
                for (Integer idx = 0; idx < cart.size(); idx++) {
                    System.out.printf("%d. %s\n", idx + 1, cart.get(idx));
                }
            }
            break;

        case "add":
            cart.add(terms[1]);
            System.out.printf("Added %s to cart\n", terms[1]);
            break;

        case "delete":
            break;

        case "exit":
            stop = true;
            break;

        default:
            System.err.println("Unknown command: %s\n", terms[0]);
    }
}

 */

 /*
  Extra stuff to add:
  > process extra params behind add command
  > process if only add command is given without any params
  > check if delete params is valid
  > 
  */