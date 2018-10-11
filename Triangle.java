public class Triangle{

  private Point p0;
  private Point p1;
  private Point p2;

  public Triangle(double x0,double y0,double x1,double y1,double x2,double y2){
    p0 = new Point(x0, y0);
    p1 = new Point(x1, y1);
    p2 = new Point(x2, y2);
  }

  public Triangle(Point p0, Point p1, Point p2){
    this.p0 = p0;
    this.p1 = p1;
    this.p2 = p2;
  }

  public Point getVertex(int index){
    Point output;
    output = new Point(getPoint(index).getX(), getPoint(index).getY());
    return output;
  }

  public Point getPoint(int point){
    if (point == 0) return p0;
    if (point == 1) return p1;
    if (point == 2) return p2;
    return new Point(0, 0);
  }

  public void setVertex(int point, Point newp){
    if (point == 0) p0 = newp;
    if (point == 1) p1 = newp;
    if (point == 2) p2 = newp;
  }

  public double getPerimeter(){
    double a, b, c;
    //a = p0.distance(p1);
    //b = p1.distance(p2);
    //c = p2.distance(p0);
    a = Point.distance(p0, p1);
    b = Point.distance(p1, p2);
    c = Point.distance(p2, p0);
    return a + b + c;
  }

  public String toString(){
    return "Triangle: A@" + p0 + " B@" + p1 +" C@" + p2 ;
  }
}
