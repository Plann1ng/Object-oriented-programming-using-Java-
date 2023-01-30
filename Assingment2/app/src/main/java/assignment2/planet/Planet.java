package assignment2.planet;

/**
 * Planet object which contains Moon objects within.
 */
public class Planet {
  private String name;
  private Integer position;
  private Integer aphelion;
  private Integer perihelion;
  private Integer noOfMoons;

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
  
      if (noOfMoons < 0) {
        throw new IllegalArgumentException("Moons can not be negative number!");
      } else {
        this.noOfMoons = noOfMoons;
      }

      if (aphelion <= 0) {
        throw new IllegalArgumentException("Aphelion must be positive integer!");
      } else {
        this.aphelion = aphelion;
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
       * Basic method to return number of moons added to the ArrayList.
       */
      public Integer getNoOfMoons() {
        return noOfMoons;
      }
    
      /**
       * Moon setter method with restrictions.
       */
      public void setNoOfMoons(Integer moonNumber) {
        if (moonNumber < 0) {
          throw new IllegalArgumentException("Moon Number must be positive integer!");
        } else {
          this.noOfMoons = moonNumber;
        }
      }
    
      /**
       * Returning Aphelion.
       */
      public Integer getAphelion() {
        return aphelion;
      }
    
      /**
       * setAphelion Method which gives possiblity to change the Aphelion in
       * case that the Aphelion size in Real World becomes bigger or smaller.
       */
      public void setAphelion(Integer aphelion) {
        if (aphelion <= 0) {
          throw new IllegalArgumentException("Aphelion must be positive integer!");
        } else {
          this.aphelion = aphelion;
        }
      }
    
      public Integer getPerihelion() {
        return perihelion;
      }
    
      /**
       * setPerihelion method provides flexibility to adjust Planet perihelion.
       */
      public void setPerihelion(Integer perihelion) {
        if (perihelion <= 0) {
          throw new IllegalArgumentException("Perihelion must be positive integer!");
        } else {
          this.perihelion = perihelion;
        }
      }
    }
    