class Rectangle extends TwoDimensionalShape {

  private double length;
  private double width;

  public Rectangle(String name){
    super(name, 0.0, 0.0);
    length = 0.0;
    width = 0.0;
  }

  public Rectangle(String name, double len, double width){
    super(name);
    this.length = len;
    this.width = width;
    area();
    perimeter();
  }

  @Override
  public double area(){
    this.area = this.length * this.width;
    return this.area;
  }

  @Override 
  public double perimeter() {
    this.perimeter = 2 * this.length + 2 * this.width;
    return this.perimeter;
  }

  public void setWidth(double width){
    this.width = width;
  }

  public double getWidth(){
    return this.width;
  }

  public void setLength(double len){
    this.length = len;
  }

  public double getLength(){
    return this.length;
  }

  public double getArea(){
    return this.area;
  }

  public double getPerimeter(){
    return this.perimeter;
  }

  public String toString(){
    System.out.println("The shape is a: " + this.name);
    System.out.println("The length and width are " + this.length + " " + this.width + " respectively");
    System.out.println("The area is: " + this.area);
    System.out.println("The perimeter is: " + this.perimeter);
    return "";
  }

}
