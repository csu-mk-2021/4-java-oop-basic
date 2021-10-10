package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {
    private double x;
    private double y;
    private Point() {; }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //https://algebra24.ru/rasstojanie-mezhdu-dvumja-tochkami
    public double getLength(Point point) {
        return (double)Math.sqrt(
            Math.pow( (point.getX() - this.x), 2 ) +
            Math.pow( (point.getY() - this.y), 2 )
        );
    }

}
