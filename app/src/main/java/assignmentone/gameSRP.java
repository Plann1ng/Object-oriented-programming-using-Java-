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
