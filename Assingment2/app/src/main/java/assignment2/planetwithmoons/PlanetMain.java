package assignment2.planetwithmoons;

/**
 * Main class using Planet and Moons.
 */
public class PlanetMain {

  /**
   * Main method executing all requirements properly.
   */
  public static void main(String[] args) {

    Planet mars = new Planet("Mars", 3, 0, 152097701, 147098074);
    Planet earth = new Planet("Earth", 4, 0, 249209300, 206669000);
    Moons deimos = new Moons("Deimos", 22);
    Moons phofos = new Moons("Phofos", 12);
    Moons moon = new Moons("Moon", 3412);
    mars.addMoon(deimos);
    mars.addMoon(phofos);
    earth.addMoon(moon);
    System.out.println("The planet is called " + mars.getName() 
        + " and have the following moons:");
    for (int i = 0; i < mars.getMoons().length; i++) {
      System.out.println("  Moon " + (i + 1) + " is called " 
                + mars.getMoons()[i].getName() + "  ("
                + mars.getMoons()[i].getkmSize() + ") km");
    }
    System.out.println("\nThe planet is called " + earth.getName() 
        + " and have the following moons:");
    for (int i = 0; i < earth.getMoons().length; i++) {
      System.out.println("  Moon " + (i + 1) + " is called " 
            + earth.getMoons()[i].getName() + " ("
            + earth.getMoons()[i].getkmSize() + ") km");
    }
  }
}
