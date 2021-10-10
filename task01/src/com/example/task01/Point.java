package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    private Point() {; }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point setX(int x) {
        this.x = x;
        return this;
    }

    public Point setY(int y) {
        this.y = y;
        return this;
    }

    public int getX() { return x;}
    public int getY() { return y;}
    //rotate to 180
    public Point flip() {
        int t = x;
        x = -y;
        y = -t;
        return this;
    }

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
