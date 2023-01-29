package assignment2.animal;

/**
 * Bird class extending Animal.
 */
public class Bird extends Animal {
  private boolean isMigrant;
  private boolean canFly;
  private String nestType;

  /**
   * Bird object with unique constructors for Birds and super constructors from the abstract Animal.
   */
  public Bird(String name, String latinName, double weight, 
      String sound, boolean isMigrant, boolean canFly,
      String nestType) {
    super(name, latinName, weight, sound);
    this.isMigrant = isMigrant;
    this.canFly = canFly;
    if (nestType.isEmpty()) {
      throw new IllegalArgumentException("Nest type can not be empty.");
    } else {
      this.nestType = nestType;
    }
  }

  public boolean isMigrant() {
    return isMigrant;
  }

  public void setMigrant(boolean isMigrant) {
    this.isMigrant = isMigrant;
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }
