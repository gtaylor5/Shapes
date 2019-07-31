class Parallelogram extends ThreeDimensionalShape {
  double l, w, d;
  
  public Parallelogram(String name, double l, double w, double d){
    super(name);
    this.l = l;
    this.w = w;
    this.d = d;
  }

  public Parallelogram(String name){
    super(name);
    this.l = 0.0;
    this.w = 0.0;
    this.d = 0.0;
  }

  public double getLen(){
    return l;
  }

  public double getWidth(){
    return w;
  }

  public double getDepth(){
    return d;
  }

  public void setLen(double len){
    this.l = len;
  }

  public void setWidth(double width){
    this.w = width;
  }

  public void setDepth(double depth){
    this.d = depth;
  }

  @Override
  public double surfaceArea(){
    double front = 2 * l * w;
    double side = 2 * w * d;
    double top = 2 * l * d;
    this.surfaceArea = front + side + top;
    return this.surfaceArea;
  }

  @Override
  public double volume(){
    this.volume = l * w * d;
    return this.volume;
  }

  // TO STRING GOES HERE

}
