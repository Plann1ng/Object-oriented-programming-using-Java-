package assignment2.comparableanimal;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Comparable class containing main.
 */
public class ComparableAnimal {

  /**
   * Main method comparing Animals regarding their LatinName.
   */
  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    Bird eagle = new Bird("White head eagle", "Aquila chrysaetos",
         3.8, "Piiii", false, true, "Tree nest");
    Bird pigeon = new Bird("Pigeon", "Columbidae", 0.309, "Glukkk", false, true, "Local houses");

    Reptile kingCobra = new Reptile(true, "Rain forests", 
        "King Cobra", "Ophiophagus hannah", 5.34, "psss");
    Reptile saltWaterCroc = new Reptile(false, "brackish and freshwater regions",
        "Saltwater crocodile",
        "Crocodylus porosus", 1000.200, "Hassh");

    Mammal kangaroo = new Mammal("Kangaroo", "Macropodidae", 53.50, "Wayyaa",
        "red to brown", false);
    Mammal mammoth = new Mammal("Mammoth", "Mammuthus", 5400.67, "Hwwhwww", "brown", true);

    animals.add(eagle);
    animals.add(pigeon);
    animals.add(kingCobra);
    animals.add(saltWaterCroc);
    animals.add(kangaroo);
    animals.add(mammoth);    Collections.sort(animals);
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i) instanceof Mammal) {
        Mammal mammalInstance = (Mammal) animals.get(i);
        System.out.println(animals.get(i).getLatinName() + "   " + mammalInstance.getFurColor());
      }
      if (animals.get(i) instanceof Bird) {
        Bird birdInstance = (Bird) animals.get(i);
        System.out.println(animals.get(i).getLatinName() + "   " + birdInstance.getNestType());
      }
      if (animals.get(i) instanceof Reptile) {
        Reptile repInstance = (Reptile) animals.get(i);
        System.out.println(animals.get(i).getLatinName() + "   " + repInstance.getHabitat());
      }
    }
  }
}