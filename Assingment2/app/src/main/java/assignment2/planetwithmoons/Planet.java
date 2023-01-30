package assignment2.planetwithmoons;

import java.util.ArrayList;

/**
 * Planet object which contains Moon objects within.
 */
public class Planet {
  private String name;
  private Integer position;
  private Integer noOfMoons;
  private Integer aphelion;
  private Integer perihelion;
  private ArrayList<Moons> moons = new ArrayList<Moons>();

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

    if (aphelion <= 0) {
      throw new IllegalArgumentException("Aphelion must be positive integer!");
    } else {
      this.aphelion = aphelion;
    }

    if (noOfMoons < 0) {
      throw new IllegalArgumentException("Moons can not be negative number!");
    } else {
      this.noOfMoons = noOfMoons;
    }

    if (perihelion <= 0) {
      throw new IllegalArgumentException("Perihelion must be positive integer!");
    } else {
      this.perihelion = perihelion;
    }
  }

  public String getName() {
    return name;
  }

  /**
   * Flexibility related method to change Planet object's name under conditions.
   */
  public void setName(String name) {
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be empty!");
    } else {
      this.name = name;
    }
  }

  public Integer getPosition() {
    return position;
  }

  /**
   * Flexibility focused position method for Planet object.
   */
  public void setPosition(Integer position) {
    if (position <= 0 || position >= 8) {
      throw new IllegalArgumentException("Position must be positive integer between 0 and 8");
    } else {
      this.position = position;
    }
  }

  /**
   * Method that @return safeArray, which is copy of the ArrayList in order to not return Arraylist
   * and get stronger encapsulation.
   */
  public Moons[] getMoons() {
    Moons[] safeArray = new Moons[moons.size()];
    for (int i = 0; i < moons.size(); i++) {
      safeArray[i] = moons.get(i);
    }
    return safeArray;
  }

  /**
   * Planet method that takes Moon objects and they are being added to 
   * the Arraylist of the Planet object.
   */
  public void addMoon(Moons newMoon) {
    if (newMoon.getName().isEmpty()) {
      throw new IllegalArgumentException("Moon name can not be empty");
    } else {
      moons.add(newMoon);
      noOfMoons++;
    }
  }