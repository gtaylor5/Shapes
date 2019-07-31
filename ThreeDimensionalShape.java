abstract class ThreeDimensionalShape extends Shape {

  protected double volume;
  protected double surfaceArea;

  abstract public double volume();
  abstract public double surfaceArea();

  public ThreeDimensionalShape(String name, double vol, double sa){
    super(name);
    this.volume = vol;
    this.surfaceArea = sa;
  }

  public ThreeDimensionalShape(String name){
    super(name);
    volume = 0.0;
    surfaceArea = 0.0;
  }

  public double getVolume(){
    return this.volume;
  }

  public double getSurfaceArea() {
    return this.surfaceArea;
  }

}
