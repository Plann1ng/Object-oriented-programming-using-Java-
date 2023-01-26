package assignmentone;

import java.util.Scanner;

/** Hexadecimal conventor.
  */
public class Hextodecimal {

  /** Method to convert hexadecimals to decimal values. 
   */

  public static Integer hex2Decimal(String input) {

    double total = 0;
    // Iterating over the user input and seperating the letters and the numbers
    for (int i = 0; i < input.length(); i++) {
      // Filetrs the numbers and applying the hex algorithm 
      if (Character.isDigit(input.charAt(i))) {
        int numbers = Character.getNumericValue(input.charAt(i));
        Double hex = (numbers) * Math.pow(16, input.length() - (1 + i));
        total += hex;
        
        /* Takes the letters from the iteration and for each letter applying the 
         * algortihm with letter's corresponding numeric value
         */
      } else if (Character.isLetter(input.charAt(i))) {
        switch (input.charAt(i)) {
          case ('a'):
            Double intgra = 10 * Math.pow(16, input.length() - (1 + i));
            total += intgra;
            break;

