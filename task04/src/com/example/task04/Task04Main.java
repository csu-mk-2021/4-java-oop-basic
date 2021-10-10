package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(0, 0), new Point(10, 10));
        System.out.println(l1.toString());

        System.out.println(l1.isCollinearLine(new Point(3, 3)));
        System.out.println(l1.isCollinearLine(new Point(0, -1)));
    }
}
