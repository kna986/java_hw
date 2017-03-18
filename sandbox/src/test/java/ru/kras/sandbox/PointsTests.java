package ru.kras.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.kras.sandbox.FirstProg.distance2;

public class PointsTests {

  Point s1 = new Point(0.0, 0.0);
  Point s2 = new Point(-1.0, -1.0);
  Point s3 = new Point(1.0, 1.0);

  @Test
  public void testDistance1() {

    assert s3.distance(s3) == 0.0;
  }

  @Test
  public void testDistance2() {

    double varTestDistance = 1.4142135623730951;
    Assert.assertEquals(distance2(s1, s2), varTestDistance);
  }
}
