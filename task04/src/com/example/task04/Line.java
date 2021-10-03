package com.example.task04;

public class Line {

    final Point p1;
    final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return "(" + p1 + ", " + p2 + ")";
    }

    public boolean isCollinearLine(Point p) {
        int dxc = p.x - this.p1.x;
        int dyc = p.y - this.p1.y;

        int dxl = this.p2.x - this.p1.x;
        int dyl = this.p2.y - this.p1.y;

        int cross = dxc * dyl - dyc * dxl;

        if (cross != 0)
            return false;

        if (Math.abs(dxl) >= Math.abs(dyl))
            return dxl > 0 ?
                    this.p1.x <= p.x && p.x <= this.p2.x :
                    this.p2.x <= p.x && p.x <= this.p1.x;
        else
            return dyl > 0 ?
                    this.p1.y <= p.y && p.y <= this.p2.y :
                    this.p2.y <= p.y && p.y <= this.p1.y;
    }
}
