package assignment2.animal;

/**
 * Main class for the first part of the  Animal exercise.
 */
public class AnimalMain {

  /**
   * Main method.
   */
  public static void main(String[] args) {
    Mammal cattle = new Mammal("swedish red and white cattle", "Bos taurus taurus", 112.03,
        "Muuuuu!", "Red and white", true);
    Reptile comodoDragon = new Reptile(true, "harsh climate", "Comodo Dragon",  
        "Varanus komodoensis", 80, "kshhhhhh kshhhh");
    Bird peafowl = new Bird("Peafowl", "Pavo cristatus",
        5, "Kaka-kaka", false, false, "a hole in the ground under a shrub");
    System.out.println("A " + cattle.getName() + cattle.makeSound());
    System.out.println("A " + peafowl.getName() + peafowl.makeSound());
    System.out.println("A " + comodoDragon.getName() + comodoDragon.makeSound());
  }
}

