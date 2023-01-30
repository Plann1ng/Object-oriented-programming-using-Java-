package assignment2.planet;

/**
 * Planet object which contains Moon objects within.
 */
public class Planet {
  private String name;
  private Integer position;
  private Integer aphelion;
  private Integer perihelion;
  private Integer noOfMoons;

  public Planet() {
  }

    /**
   * Planet object.
   */
  public Planet(String name, Integer position, Integer noOfMoons, Integer aphelion,
      Integer perihelion) {
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be empty!");
    } else {
      this.name = name;
    }

    if (position <= 0 || position >= 8) {
        throw new IllegalArgumentException("Position must be positive integer between 0 and 8");
      } else {
        this.position = position;
      }
  
      if (noOfMoons < 0) {
        throw new IllegalArgumentException("Moons can not be negative number!");
      } else {
        this.noOfMoons = noOfMoons;
      }

      if (aphelion <= 0) {
        throw new IllegalArgumentException("Aphelion must be positive integer!");
      } else {
        this.aphelion = aphelion;
      }
  
      if (perihelion <= 0) {
        throw new IllegalArgumentException("Perihelion must be positive integer!");
      } else {
        this.perihelion = perihelion;
      }
    }