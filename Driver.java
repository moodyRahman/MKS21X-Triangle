public class Driver{

  public static void main(String[] args) {
    Point wack = new Point(3, 5);
    Point penny = new Point(3, 7);

    System.out.println(Point.distance(wack, penny));

    System.out.println(penny.distance(wack));
  }
}
