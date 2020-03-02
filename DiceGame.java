import java.util.Random; 
import java.util.Scanner;

/**
 * Class DiceGame.
 * This code generates a random number and the user trys to guess it.
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-02-25 
 */

public class DiceGame {
  
  /**
  * This class generates a random number from a given range, then has the user play a guessing game.
  */
  
  public static void main(String[] args) throws Exception {
    
    // Create variables
    int maxRange;
    int userGuess;
    int randomNumber;
    int guessCounter = 1;
    
    // Create scanner and Random object
    Scanner userInput = new Scanner(System.in);
    Random random = new Random();
    
    // Ask user for max range
    System.out.print("Welcome to Dice Game! ");
    
    System.out.print("Enter max range for "
        + "the randomizer: ");
        
    try {
      // Get max range and random number.
      maxRange = userInput.nextInt();
      randomNumber = random.nextInt(maxRange) + 1;
      
      // Ask user for first guess
      System.out.print("Guess a number between 1 and " + maxRange + " : ");
        
      try {
        // Get user's guess
        userGuess = userInput.nextInt();
        
        while (userGuess != randomNumber) {
          guessCounter++;
          System.out.print("Incorrect. Please guess again: ");
          userGuess = userInput.nextInt();
        }
        System.out.print("Good job! The random number was " + randomNumber + ". It took you " 
            + guessCounter + " guesses.");
        
      } catch (Exception e) {
        // Guess was not int
        System.err.println("Invalid Input");
      }
      
    } catch (Exception e) {
      // Range was invalid
      System.err.println("Invalid Input");
    }
  }
}