package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(){};

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int tem_x = this.x;
        this.x = -this.y;
        this.y = -tem_x;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
