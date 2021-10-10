package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;
    private final int y;

    private Point() {
        x =0;
        y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x;}
    public int getY() { return y;}

    //https://algebra24.ru/rasstojanie-mezhdu-dvumja-tochkami
    public double distance(Point point) {
        return (double)Math.sqrt(
                Math.pow( (point.getX() - this.x), 2 ) +
                        Math.pow( (point.getY() - this.y), 2 )
        );
    }

    public String toString() {
        String res = String.valueOf(x);
        res = res.concat(String.valueOf(y));
        return res;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
