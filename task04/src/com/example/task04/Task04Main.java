package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line l = new Line(new Point(3,1), new Point(8,5));
        Point p1 = new Point(3,1);
        Point p2 = new Point(5, 1);
        System.out.println(l.toString());
        System.out.println(l.isCollinearLine(p1));
        System.out.println(l.isCollinearLine(p2));
    }
}
