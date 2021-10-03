package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    void flip(){
        int tmp = -this.x;
        this.x = -this.y;
        this.y = tmp;

    }
    double distance(Point point){
        double ac = Math.abs(this.x - point.x);
        double cb = Math.abs(this.y - point.y);
        return Math.hypot(ac, cb);
    }
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
