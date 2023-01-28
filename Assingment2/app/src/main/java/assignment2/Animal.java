package assignment2.animal;

/**
 * Abstract Animal class containing common constructors for all instances of Animals.
 */
public abstract class Animal {
  private String name;
  private String latinName;
  private double weight;
  protected String sound;

  public Animal() {}

    /**
   * Animal object with getters and setters and compareTo method which is
   * unique for abstract classes.
   */
  public Animal(String name, String latinName, double weight, String sound) {
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be empty!");
    } else {
      this.name = name;
    }

    if (latinName.isEmpty()) {
      throw new IllegalArgumentException("Latin Name can not be empty!");
    } else {
      this.latinName = latinName;
    }

    if (weight <= 0) {
      throw new IllegalArgumentException("Weight can not be 0!");
    } else {
      this.weight = weight;
    }

    if (sound.isEmpty()) {
      throw new IllegalArgumentException("Sound can not be empty!");
    } else {
      this.sound = sound;
    }
  }
