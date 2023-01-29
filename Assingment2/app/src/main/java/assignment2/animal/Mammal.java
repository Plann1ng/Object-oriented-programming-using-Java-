package assignment2.animal;

/**
 * Mammal class extending abstract class Animal.
 */
public class Mammal extends Animal {

  private String furColor;
  private boolean hasWinterfur;

  public Mammal() {}

  /**
   * Mammal object with stated methods required from the assignment.
   */
  public Mammal(String name, String latinName, double weight,
      String sound, String furColor, boolean hasWinterfur) {
    super(name, latinName, weight, sound);
    if (furColor.isEmpty()) {
      throw new IllegalArgumentException("FurColor can not be empty!");
    } else {
      this.furColor = furColor;
    }
    this.hasWinterfur = hasWinterfur;
  }

  public String getFurColor() {
    return furColor;
  }

  @Override
  public String makeSound() {
    return " says: " + sound;
  }
