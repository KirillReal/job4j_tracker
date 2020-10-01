package ru.job4j.oop;
import java.lang.Math.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point3 {
    private int x;
    private int y;
    private int z;
    public Point3(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distance(Point3 that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    public double distance3d(Point3 that){
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
