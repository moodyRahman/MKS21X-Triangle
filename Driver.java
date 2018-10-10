public class Driver{

  public static void main(String[] args) {
    Point wack = new Point(3, 5);
    Point penny = new Point(3, 7);

    Triangle trick = new Triangle(new Point(4, 5), new Point(1, 2), new Point(6, 7));
    System.out.println(trick.getPoint(2));
  }
}
