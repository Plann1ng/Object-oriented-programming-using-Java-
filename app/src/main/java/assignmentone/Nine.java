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
        if (!userchoice.equals("Y") && !userchoice.equals("N")) {

             System.out.println("Please follow the instructions!");

        } else if (userchoice.equals("Y")) {

          // Cheking if the computer rolled 4 or more, if it is the case the computer
          // won't do another roll
        if (comp >= 4) {
          int playerchois = dice.nextInt(1, 7);
          int fnlvalue = playerchois + player;
          System.out.print("\nYour rolled " + playerchois);
          System.out.print(", in total you have " + fnlvalue + "\n");

              // Instance where after the second roll user gets number higher than 9
              if (fnlvalue > 9) {

                System.out.println("\nfat\n");
                // When the user does not cross the 9 limitation
              } else {
    
                // User loses.
                if (fnlvalue < comp) {
                  System.out.println("\nComputer rolled " + comp);
                  System.out.println("\nYou lost!\n");

            // User wins
            } else if (fnlvalue > comp) {

                System.out.println("Computer rolled " + comp);
                System.out.println("\nYou won!\n");
                // Draw
              } else if (comp == fnlvalue) {
  
                System.out.println("Computer rolled " + comp);
                System.out.println("\nIt is a draw!\n");
  
              }
            }
          // Instance when the computer does rolls less than 4 on the first rolled dice
        } else if (comp <= 4) {

            int playerchoice = dice.nextInt(1, 7);
            int finalvalue = playerchoice + player;
            int comp2 = dice.nextInt(1, 7);
            int computer = comp + comp2;
            System.out.print("\nYour rolled " + playerchoice);
            System.out.print(", in total you have " + finalvalue + "\n");
            // User rolls more than 9
            if (finalvalue > 9) {
  
              System.out.println("\nfat!\n");

                    // Validating that both participants are below 9
                } else if (finalvalue <= 9 && computer <= 9) {
                    // User loses
                    if (finalvalue < computer) {
        
                      System.out.println("\nComputer rolled " + comp);
                      System.out.print("Computer rolls again and gets " + comp2);
                      System.out.print(", Computer got " + computer + " in total.\n");
                      System.out.println("\nYou lost!\n");
                    // User wins
                    } else if (finalvalue > computer) {

                        System.out.println("Computer rolled " + comp);
                        System.out.print("Computer rolls again and gets " + comp2);
                        System.out.print(", Computer got " + computer + " in total.");
                        System.out.println("\nYou won!\n");

                              // Draw
            } else if (computer == finalvalue) {

                System.out.println("Computer rolled " + comp);
                System.out.print("Computer rolls again and gets " + comp2);
                System.out.print(", Computer got " + computer + " in total.");
                System.out.println("\nIt is a draw!y\n");
              }
            // If the computer is above 9
        } else {

            System.out.println("Computer rolled " + comp);
            System.out.println("Computer rolls again and gets " + comp2);
            System.out.print("Computer got " + computer + " in total.");
            System.out.println("\nYou won!\n");

          }
        }
        // If user does not starts the game
    } else if (variableplay.equals("N")) {

        System.out.println("\nSee you next times!\n");

        // No for second roll
    } else if (userchoice.equals("N")) {
        // Computer rolls 1 time
        if (comp >= 4) {

          System.out.print("\nYour rolled: " + player);
          System.out.print(", in total you have " + player + "\n");
          // User loses
          if (player < comp) {

            System.out.println("\nComputer rolled " + comp);
            System.out.println("\nYou lost!\n");
            // User wins
          } else if (player > comp) {

            System.out.println("Computer rolled " + comp);
            System.out.println("\nYou won!\n");
            // Draw
          } else if (comp == player) {

            System.out.println("Computer rolled " + comp);
            System.out.println("\nIt is a draw!\n");

          }
                    // Computer rolls twice
        } else if (comp <= 4) {

            int comp2 = dice.nextInt(1, 3);
            int computer = comp + comp2;
            System.out.print("\nYour rolled " + player);
            System.out.print(", in total you have " + player + "\n");
            // Validation for limitations
            if (player <= 9 && computer <= 9) {
              // User loses
              if (player < computer) {
  
                System.out.println("\nComputer rolled " + comp);
                System.out.print("Computer rolls again and gets " + comp2);
                System.out.print(", Computer got " + computer + " in total.\n");
                System.out.println("\nYou lost!\n");
                          // User wins
                        } else if (player > computer) {

                            System.out.println("Computer rolled " + comp);
                            System.out.print("Computer rolls again and gets " + comp2);
                            System.out.print(", Computer got " + computer + " in total.");
                            System.out.println("\nYou won!\n");