package assignmentone;

import java.util.Random;
import java.util.Scanner;

/** Dice program.
 */
public class Nine {

  /**
   * The dice game simulator,
   * may the force be with you or you will be FAT!.
   */
  public static void main(String[] args) {

    // User input to start the program
    Scanner input = new Scanner(System.in, "UTF-8");
    System.out.println("Wanna play a game? (Y / N) ?\n");
    String variableplay = input.nextLine();

    if (variableplay.equals("N")) {
        System.out.println("See you next time!.");
  
        // Invalid input interpretation
      } else if (!variableplay.equals("N") && !variableplay.equals("Y")) {
        System.out.println("Please follow the instructions.");
  
        // Game starts
      } else if (variableplay.equals("Y")) {
          Random dice = new Random();
          int player = dice.nextInt(1, 7);
          int comp = dice.nextInt(1, 7);
          System.out.println("\nYou rolled: " + player);
          System.out.println("\nYou want to roll once more?\n");
          String userchoice = input.nextLine();
          // Second roll
