import java.util.*;
class Sphere extends ThreeDimensionalShape {

  private final double PI = 3.14159;
  private double radius;

  public Sphere(String name, double radius){
    super(name);
    this.radius = radius;
  }
  
  public Sphere(String name){
    super(name);
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  @Override
  public double volume(){
    this.volume = (4/3) * Math.pow(this.radius, 3) * PI;
    return this.volume;
  }

  @Override 
  public double surfaceArea(){
    this.surfaceArea = 4 * Math.pow(this.radius, 2) * PI;
    return this.surfaceArea;
  }

  @Override
  public String toString(){
    return "This is a: " + this.name + "\nIt's radius is: " + this.radius;
  }

}
