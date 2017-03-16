package ru.kras.sandbox;

public class FirstProg {

  public static void main(String[] args) {
    Point s1 = new Point(0.0, 0.0);
    Point s2 = new Point(-1.0, -1.0);

    double dist1 = s1.distance(s2);
    System.out.println("Hello from method! Distance is: " + dist1);
    double dist2 = distance2(s1, s2);
    System.out.println("Hello from function! Distance is: " + dist2);

  }

  public static double distance2(Point s1, Point s2) {
    return Math.sqrt(((s1.x - s2.x) * (s1.x - s2.x)) + ((s1.y - s2.y) * (s1.y - s2.y)));
  }

}
