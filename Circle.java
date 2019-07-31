import java.util.*;

class Circle extends TwoDimensionalShape {

  double radius;
  private static final double PI = 3.14159;

  public Circle(String name){
    super(name);
    radius = 0.0;
  }

  public Circle(String name, double rad){
    super(name);
    this.radius = rad;
  }

  @Override
  public double area(){
    this.area = Math.pow(this.radius, 2) * PI;
    return this.area;
  }

  @Override
  public double perimeter(){
    this.perimeter = 2 * this.radius * PI;
    return this.perimeter;
  }

  public void setRadius(double r){
    this.radius = r;
  }

  public double getRadius(){
    return this.radius;
  }
  
  @Override
  public String toString(){
    System.out.println("The shape is a: " + this.name);
    System.out.println("The Radius is: " + this.radius);
    System.out.println("The area is: " + this.area);
    System.out.println("The perimeter is: " + this.perimeter);
    return "";
  }

}
