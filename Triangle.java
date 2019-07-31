import java.util.*;
class Triangle extends TwoDimensionalShape {

  // ALL TRIANGLES ARE RIGHT TRIANGLES

  private double base;
  private double height;
  
  public Triangle(String name, double base, double height){
    super(name);
    this.base = base;
    this.height = height;
    this.area();
    this.perimeter();
  }

  public Triangle(String name){
    super(name);
  }

  @Override
  public double area(){
    this.area = 0.5 * base * height;
    return this.area;
  }

  @Override 
  public double perimeter(){
    double aSquared = Math.pow(base, 2.0);
    double bSquared = Math.pow(height, 2.0);
    double cSquared = aSquared + bSquared;
    double hypot = Math.sqrt(cSquared);
    this.perimeter = base + height + hypot;
    return this.perimeter;
  }

  public void setHeight(double h){
    this.height = h;
  }

  public double getHeight(){
    return this.height;
  }

  public void setBase(double b){
    this.base = b;
  }

  public double getBase(){
    return this.base;
  }

  @Override
  public String toString(){
    return "The shape is a: " + this.name + "\n" + 
      "The Height is: " + this.height + "\n" +
      "The Base is: " + this.base + "\n" + 
      "The area is: " + this.area + "\n" +
      "The perimeter is: " + this.perimeter + "\n";
 }

}
