package com.example.task01;

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
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public void flip() {
        int tmpX = x;
        x = -y;
        y = -tmpX;
    }

    public double distance(Point point) {
        if(point !=null)
            return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
        throw new IllegalArgumentException("pointer is null");
    }


    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
