abstract class TwoDimensionalShape extends Shape {
  
  protected double area;
  protected double perimeter;

  abstract public double area();
  abstract public double perimeter();

  public TwoDimensionalShape(String name, double area, double perim){
    super(name);
    this.area = area;
    this.perimeter = perim;
  }

  public TwoDimensionalShape(String name){
    super(name);
    area = 0.0;
    perimeter = 0.0;
  }

  public double getArea(){
    return this.area;
  }

  public double getPerimeter(){
    return this.perimeter;
  }
}
