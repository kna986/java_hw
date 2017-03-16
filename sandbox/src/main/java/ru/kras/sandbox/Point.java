package ru.kras.sandbox;

public class Point {

  public double x, y;

  public Point(double p1, double p2) {
    this.x = p1;
    this.y = p2;
  }

  public double distance(Point p) {
    return Math.sqrt(((p.x - x) * (p.x - x)) + ((p.y - y) * (p.y - y)));
  }


}
