import java.util.Random;

/**
 * Beginning of ants exercise.
 */
public class Ant {

  /**
   * Start of the main function.
   */
  public static void main(String[] args) {

    double totalsteps = 0;
    Double averagesteps = 0.0;
    int tiles = 64;

    Random rand = new Random();
    for (int indx = 1; indx < 11; indx++) {
        /*
         * Building up a 2D array filled with integer 0
         */
        int[][] grid = new int[8][8];
        int x = rand.nextInt(0, 8);
        /*
         * Grid and value restarts with default values so that another test can be done
         */
        int y = rand.nextInt(0, 8);
        /*
         * Counter to stop simulation. Will be incremented each time ant visits
         * a square with value 0 (that was not visited before).
         */
        int visited = 0;
  
        int steps = 0;
  
        grid[x][y] = 1;
        visited++;
        while (true) {
          /*
           * Direction variable to simulate the ant movement within the board
           * 1 - y axis plus (top)
           * 2 - x axis plus (right)
           * 3 - y axis minus (down)
           * 4 - x axis minus (left)
           */
          int direction = rand.nextInt(1, 5);
  
          /*
           * Checking if the movement was made on the x or y axis
           * and putting condition to prevent the ant going out of the
           * board by stating that if ant steps out do not validate current loop instance
           * and keep doing that until ant chooses another direction and does not cross
           * the
           * border. All of the else statements does update the location of the ant.
           */
          if (direction == 1) {
            steps++;
            y++;
            if (y > 7) {
              y--;
              /*
               * steps -- to make the ant move neutral in until ant chooses another path to
               * go.
               */
              steps--;
  
            }
          }
          if (direction == 2) {
            steps++;
            y--;
            if (y < 0) {
              y++;
              steps--;
            }
          }
          if (direction == 3) {
            steps++;
            x--;
            if (x < 0) {
              x++;
              steps--;
            }
          }
          if (direction == 4) {
            steps++;
            x++;
            if (x > 7) {
              x--;
              steps--;
            }
          }
          if (grid[x][y] == 0) {
            /* increment value for every visited tile. */
            grid[x][y] = 1;
            visited++;
          }
          /*
           * Condition will be filled if visited value reaches 64.
           */
          if (visited == tiles) {
            break;
          }
  
        }
        totalsteps += steps;
        System.out.println("Number of steps in simulation " + indx + ": " + steps);
      }
      averagesteps = totalsteps / 10;
      System.out.println("Average amount of steps: " + averagesteps);
    }
  }
  