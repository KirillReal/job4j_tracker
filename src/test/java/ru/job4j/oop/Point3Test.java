package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class Point3Test {

    @Test
    public void distance() {
        double expected = 2.0;
        Point3 a = new Point3(0, 0);
        Point3 b = new Point3(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void distance3d() {
        double expected = 3.0;
        Point3 a = new Point3(6,  5, 4);
        Point3 b = new Point3(7,  7, 6);
        double rsl = a.distance3d(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}