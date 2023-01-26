package assignmentone;

import java.util.Scanner;
/**
   * Dangerous work program. 
   */

public class DangerousWork {

  /**
   * Program checking how many days will be necesarry to get speicific
   *  user defined amount of money. 
   */
  public static void main(String[] args) {

    int days = 1;
    Scanner in = new Scanner(System.in, "UTF-8");
    System.out.print("Please enter how much money you want to make: ");
    int choice = Integer.parseInt(in.nextLine());

    //Starting from 0.02 since days are presetten to 1
    double endvalue = 0.02;

    in.close();

    while (endvalue <= choice) {

      endvalue = (endvalue * 2);
      days += 1;

    } 

    if (days >= 30) {

      System.out.println("You death, you get no money.");

    } else {

      System.out.println("You will have it in: " + days + " days.");
      
    } 
  }
}

