package assignment2.comparableanimal;

/**
 * Reptile class.
 */
public class Reptile extends Animal {

  private boolean isPoisonous;
  private String habitat;

  public Reptile() {}

  /**
   * Reptile object as extension from Animal class containing basic methods.
   */
  public Reptile(boolean isPoisonous, String habitat, String name, 
      String latinName, double weight, String sound) {

    super(name, latinName, weight, sound);
    this.isPoisonous = isPoisonous;
    
    if (habitat.isEmpty()) {
      throw new IllegalArgumentException("Habitat can not be empty!");
    } else {
      this.habitat = habitat;
    }
  }
  /* Did not added setPoisinous, because in real world if one Animal wasn't poisonous 
    it can not be changed.
   */
  
  public boolean isPoisonous() {
    return isPoisonous;
  }

  public String getHabitat() {
    return habitat;
  }

  @Override
  public String makeSound() {
    return " hizzles: " + sound;
  }

  /**
   * Habitat setter under specified conditions to have encapsulation.
   */
  public void setHabitat(String habitat) {
    if (habitat.isEmpty()) {
      throw new IllegalArgumentException("Habitat can not be empty!");
    } else {
      this.habitat = habitat;
    }
  }
}
