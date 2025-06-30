package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 5) + 1;
        System.out.print("I'm thinking of a number between 1 and 5.\n");
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        for (int i = 1; i < 4; i++) {
            System.out.print("Guess " + i + ": ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("You guessed it!");
                System.out.println("You win!");
                return;
            }
            if (i<3) {
                System.out.println("Wrong guess.");
            }

        }
        System.out.print("You lose. The correct number was " + secretNumber + ".");
    }
}