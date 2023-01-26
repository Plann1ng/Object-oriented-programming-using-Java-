package assignmentone;

import java.util.Scanner;
/**Day of the week program. 
  */

public class Dayofweek {

  /** Program which takes user input as integers for corresponding 
   * Year, Month and Day and returns which day it is.*/
  public static void main(String[] args) {

    // User inputs
    Scanner s = new Scanner(System.in, "UTF-8");
    System.out.print("Enter Year: ");
    int year = Integer.parseInt(s.nextLine());
    System.out.print("Enter Month (1-12): ");
    int month = Integer.parseInt(s.nextLine());
    System.out.print("Enter Day(1-31): ");
    int day = Integer.parseInt(s.nextLine());
    int q = day;
    int m = month;
    // Setting month to 13 or 14 and decrementing the year by one
    // to get correct output from the formula
    if (m == 1) {
      year--;
      m = 13;
    } else if (m == 2) {
      year--;
      m = 14;
    }

    int j = year / 100;
    int k = year % 100;
    int h = (q + ((26 * (m + 1)) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

    switch (h) {
      case 0:
        System.out.println("Day of the week is: Saturday");
        break;
      case 1:
        System.out.println("Day of the week is: Sunday");
        break;
      case 2:
        System.out.println("Day of the week is: Monday");
        break;
      case 3:
        System.out.println("Day of the week is: Tuesday");
        break;
      case 4:
        System.out.println("Day of the week is: Wednesday");
        break;
      case 5:
        System.out.println("Day of the week is: Thursday");
        break;
      default:
        System.out.println("Day of the week is: Friday");
        break;

    } s.close();
  }
}