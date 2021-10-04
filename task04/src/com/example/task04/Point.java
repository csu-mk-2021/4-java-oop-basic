package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
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
