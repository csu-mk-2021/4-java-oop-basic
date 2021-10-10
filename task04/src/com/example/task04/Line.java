package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;
    private Line() {; }
    public Line(Point p1, Point p2) {
        if(p1 == null || p2 == null) {
            p1 = new Point(0, 0);
            p2 = new Point(0, 0);
            throw new IllegalArgumentException("point must be not null!");
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }

    //check if point on Line
    //https://otvet.mail.ru/question/20565241
    public boolean isCollinearLine(Point p3) {
        if(p3 == null)
            throw new IllegalArgumentException("p3 must be not NULL!");
        double a = ((double) (p3.getX() - p1.getX()) / (p2.getX() - p1.getX()));
        double b = ((double) (p3.getY() - p1.getY()) / (p2.getY() - p1.getY()));
        return (a == b);
    }

    public String toString() {
        return String.format("(%d,%d)(%d,%d)", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
