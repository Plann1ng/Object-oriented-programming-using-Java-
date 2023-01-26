package assignmentone;

import java.util.Random;
import java.util.Scanner;

/** Program to simulate Rock, Paper, Scissor game
   * againts AI. 
   */

public class Gamesrp {

  /**
   * Main method. 
   */
  public static void main(String[] args) {

    int draw = 0;
    int you = 0;
    int comptr = 0;

    Random comp = new Random();
    Scanner choice = new Scanner(System.in, "UTF-8"); 
    while (true) {
        //Choosing random between 1-3 for the computer's selection
        int computer = comp.nextInt(1, 4);
  
        System.out.println("Scissor (1), rock (2), paper (3) or 0 to quit: ");
  
        int finalchoice = Integer.parseInt(choice.nextLine());
  
        /* Checks all possibilities when user choise is 1 and increments
         * the score correspondingly
         */
        if (finalchoice == 1 && computer == 1) {

            System.out.println("It is a draw, Computer had scissor also!");
            draw += 1;
          } else if (finalchoice == 1 && computer == 2) {
      
            System.out.println("It is a lose, Computer had rock!");
    
            comptr += 1;
          } else if (finalchoice == 1 && computer == 3) {
      
            System.out.println("It is a win, computer had paper");
    
            you += 1;