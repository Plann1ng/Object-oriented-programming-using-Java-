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