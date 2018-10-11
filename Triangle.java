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
}
