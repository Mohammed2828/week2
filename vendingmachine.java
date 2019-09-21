import javax.swing.*;
import java.util.Scanner;

public class vendingmachine {
    public static void main(String[] args) {

        System.out.println(" Enter each item price between 25 and a dollar, in 5-cent increments ");
        
        int amount, originalAmount,
                quarters, dimes, nickels, pennies;
        Scanner keyboard = new Scanner(System.in);
        amount = keyboard.nextInt();
        amount=100-amount;
        originalAmount = amount;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;
        System.out.println("your change is " + originalAmount);
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels and");
        System.out.println(pennies + " pennies");

    }
}
