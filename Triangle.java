public class Triangle{

  private Point p1;
  private Point p2;
  private Point p3;

  public Triangle(x1, y1, x2, y2, x3, y3){
    p1 = new Point(x1, y1);
    p2 = new Point(x1, y1);
    p3 = new Point(x1, y1);
  }

  public Triangle(Point p1, Point p2, Point p3){
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public getPoint(int point){
    if (point = 1) return p1;
    if (point = 2) return p2;
    if (point = 3) return p3;
  }
}
