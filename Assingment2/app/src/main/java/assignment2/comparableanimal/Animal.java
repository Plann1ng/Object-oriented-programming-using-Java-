package assignment2.comparableanimal;

/**
 * Abstract Animal class containing common constructors for all instances of Animals.
 */
public abstract class Animal implements Comparable<Animal> {
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

  public String getName() {
    return name;
  }

  /**
   * Name setter method with additional restrictive if statements which
   * provides encapsulation.
   */
  public void setName(String name) {
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be empty!");
    } else {
      this.name = name;
    }
  }

  public String getLatinName() {
    return latinName;
  }

  /**
   * Latin name setter flexibility focused which makes it possible
   * to change Latin name of given object without need to make a new
   * object from zero just to make it with different Latin name.
   */
  public void setLatinName(String latinName) {
    if (latinName.isEmpty()) {
      throw new IllegalArgumentException("Latin Name can not be empty!");
    } else {
      this.latinName = latinName;
    }
  }

  public double getWeight() {
    return weight;
  }

  /**
   * Reusage focused weight setter method where weight can be setten under restrictions only.
   */
  public void setWeight(double weight) {
    if (weight == 0) {
      throw new IllegalArgumentException("Weight can not be 0!");
    } else {
      this.weight = weight;
    }
  }

  public String makeSound() {
    return sound;
  }

  /**
   * Sound setter method where sound can be setten under restrictions only.
   */
  public void setSound(String sound) {
    if (sound.isEmpty()) {
      throw new IllegalArgumentException("Sound can not be empty!");
    } else {
      this.sound = sound;
    }
  }
  
  //Recursive method compareTo.
  @Override
  public int compareTo(Animal o) {
    int compareInt = this.getLatinName().compareTo(o.getLatinName());
    if (compareInt < 0) {
      return -1;
    } else if (compareInt > 0) {
      return 1;
    } else {
      return 0;  
    }
  }
}