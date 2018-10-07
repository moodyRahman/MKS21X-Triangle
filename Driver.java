public class Driver{

  public static void main(String[] args) {
    Point wack = new Point(3.0, 5);

    wack.shift(34, 6.0);

    System.out.println(wack.getX());
    System.out.println(wack.getY());

  }
}
