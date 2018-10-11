public class Driver{

  public static void main(String[] args) {
    Point wack = new Point(3, 5);
    Point penny = new Point(3, 7);

    Triangle trick = new Triangle(new Point(4, 5), new Point(1, 2), new Point(6, 7));
    Triangle trock = new Triangle(0, 0, 6, 0, 3, 5);
    System.out.println(trock.getPoint(0));
    System.out.println(trock.getPerimeter());
    System.out.println(Point.distance(trock.getPoint(0), trock.getPoint(1)));
    System.out.println(Point.distance(trock.getPoint(1), trock.getPoint(2)));
    System.out.println(Point.distance(trock.getPoint(2), trock.getPoint(0)));
  }
}
