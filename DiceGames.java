import java.util.Random;
import java.util.Scanner;
/**

* Dice Games.

* @author  Andrew Kuekam
* @version 1.0
* @since   2020-11-02 
*/

//  
public class DiceGames {
  /**
  * .
  */
  public static void main(String[] args) {
    
        //This ask the user to choose its gamemode
    System.out.println("Choose your game mode:");
    System.out.println("1.Easy mode (3 guess).");
    System.out.println("2.Normal mode (2 guesses).");
    System.out.println("3.Hard mode (1 guesses).");
    
    Scanner userNum = new Scanner(System.in);
    
    //This genarate number between 1 and 6
    Random rand = new Random();
    
    //Declare the String
    Scanner userInput = new Scanner(System.in);
    String userChoice;
    userChoice = userInput.next();
    
    //This declare the user guesses
    int guess = 0;
    //String usergamemode = userChoice;
    
    if (userChoice.equals("1")) {
      System.out.print(" Enter a random number between 1 and 6:");
      for (int num = 1; num <= 3; num = num + 1) {
        if (userInput.nextInt() == num) {
          System.out.println("That's right! You win!");
        } else {
          System.out.println("You got it Wrong! Try a gain");
          
        }
        
      }
      
    } else if (userChoice.equals("2")) {
      System.out.println("Enter a number between 1 and 6:");
      for (int num = 1; num <= 2; num = num + 1) {
        if (userInput.nextInt() == num) {
          System.out.println("WOW! That's right! You Win!");
        } else {
          System.out.println(" You got it Wrong! Try a gain");
        }
        
      }
    } else if (userChoice.equals("3")) {
      System.out.println("Enter a number between 1 and 6:");
      for (int num = 1; num <= 1; num = num + 1) {
        if (userInput.nextInt() == num) {
          System.out.println("WOW! That's right! You Win!");
        } else {
          System.out.println(" You got it Wrong! You lose");
          
        }
      }
    }
  }
}
