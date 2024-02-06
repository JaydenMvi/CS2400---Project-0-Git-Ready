//
// Name: Mai, Jayden
// Project: #2
// Due: 10/4/23
// Course: cs-1400-02-sp23
//
// Description:
//      generates a random number and then let the user guess the word
//

import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public static void main (String[] args){
        System.out.println("Guess My Number Game by J. Mai");
        System.out.println();
        System.out.println("A secret number between 1-100 has been generated... ");
        System.out.println("Enter quess 0 to quit.");
        System.out.println();

        Random randomNumber = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        if (args.length > 0){
            randomNumber.setSeed(Long.valueOf(args[0]));
        }

        int secretNumber = randomNumber.nextInt(99) + 1;
        int guessCounter = 1;
        final int QUIT = 0;
        System.out.print("Enter your guess? ");
        int userGuess = keyboard.nextInt();

        while ((userGuess != secretNumber) && (userGuess != QUIT)){
            if (userGuess < secretNumber){
                System.out.println("Guess is low, try again.");
            }
            else {
                System.out.println("Guess is high, try again.");
            }
            guessCounter++;
            System.out.print("Enter your guess? ");
            userGuess = keyboard.nextInt();
        }

        System.out.println();

        if (userGuess == secretNumber){
            if (guessCounter == 1){
                System.out.println("Congratulations, you got it in " + guessCounter + " guess!");
            }
            else{
                System.out.println("Correct in " + guessCounter + " guesses.");
            }
        }
        else{
            System.out.println("The secret number is " + secretNumber + ".");
        }
    } 
}