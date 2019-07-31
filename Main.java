class Main {

  public static void main(String[] args){
    Rectangle rect = new Rectangle("rectangle 1");
    Triangle triangle = new Triangle("triangle 1");
    Circle circle = new Circle("circle 1");

    rect.setLength(5);
    rect.setWidth(2);
    rect.area();
    rect.perimeter();
    rect.toString();

    triangle.setBase(3);
    triangle.setHeight(4);
    triangle.area();
    triangle.perimeter();
    triangle.toString();

    circle.setRadius(10);
    circle.area();
    circle.perimeter();
    circle.toString();

    Sphere sphere = new Sphere("My Sphere");
    sphere.setRadius(10);
    sphere.volume();
    sphere.surfaceArea();
    sphere.toString();

    Parallelogram pgram = new Parallelogram("My box");
    pgram.setLen(5);
    pgram.setWidth(5);
    pgram.setDepth(5);
    System.out.println((int)pgram.volume());
    System.out.println(pgram.surfaceArea());
  
  }

}
