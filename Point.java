package com.company;

public class Point {
    double x;
    double y;
    int spot;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printMe() {
        System.out.printf("X-coord: %5.2f Y-coord: %5.2f\n", this.x, this.y);
    }
}
