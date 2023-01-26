package assignmentone;

import java.util.Scanner;
/** Diamond printer program.
  */

public class Diamonds {

  /**
   * Program to print out diamond shaped asteriks.
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in, "UTF-8");

    while (true) {
      System.out.print("Please provide a positive number: ");
      int number = scan.nextInt();
      // Checks for negative integer to break the loop
      if (number < 0) {
        System.out.println("Good day!");
        break;
      } else {

        int empty = number - 1;
        for (int i = 1; i <= number; i++) {
          for (int j = 1; j <= empty; j++) {
            System.out.print(" ");
          }
          empty--;
          for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
          }
          System.out.println("");
        }
        empty = 1;
        for (int i = 1; i <= number - 1; i++) {
          for (int j = 1; j <= empty; j++) {
            System.out.print(" ");
          }
          empty++;
          for (int j = 1; j <= 2 * (number - i) - 1; j++) {
            System.out.print("*");
          }
          System.out.println("");
        }
      }
    }
    scan.close();
  }
}
