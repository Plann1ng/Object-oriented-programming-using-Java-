package assignment2.planet;

/**
 * Main class using Planet and Moons.
 */
public class PlanetMain {

  /**
   * Main method executing all requirements properly.
   */
  public static void main(String[] args) {

    Planet mars = new Planet("Mars", 3, 2, 152097701, 147098074);
    Planet earth = new Planet("Earth", 4, 1, 249209300, 206669000);
    System.out.println(earth.getName() + ":" 
        + "\n" + "\tPosition: " + earth.getPosition() + "\n\tMoons: "
        + earth.getNoOfMoons() + "\n\tAphelion: " + earth.getAphelion() 
        + "\n\tPerihelion: " + earth.getPerihelion());
    System.out.println(mars.getName() + ":" 
        + "\n" + "\tPosition: " + mars.getPosition() + "\n\tMoons: "
        + mars.getNoOfMoons() + "\n\tAphelion: " + mars.getAphelion() 
        + "\n\tPerihelion: " + mars.getPerihelion());
  }
}