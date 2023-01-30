package assignment2.planetwithmoons;

/**
 * Moons class with getters.
 * Did not included setters in order to make it for realistic. 
 */
public class Moons {
  private String name;
  private Integer kmSize;

  /**
   * Moon object containing name and kmSize.
   */
  public Moons(String name, Integer kmSize) {
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be empty!");
    } else {
      this.name = name;
    }

    if (kmSize <= 0) {
      throw new IllegalArgumentException("KmSize must be positive integer!");
    } else {
      this.kmSize = kmSize;
    }
  }

  public String getName() {
    return name;
  }

  public Integer getkmSize() {
    return kmSize;
  }
}
