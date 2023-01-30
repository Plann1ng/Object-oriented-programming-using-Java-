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
