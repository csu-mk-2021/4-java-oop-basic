package com.example.task05;
import java.util.*;

public class PolygonalLine {
    private Vector <Point> points=new Vector<Point>();

    public void setPoints(Point[] points) {
        this.points = new Vector<Point>();

        for(Point p : points)
        {
            if(p == null)
                throw new IllegalArgumentException("point must be not null!");

            addPoint(p);
        }
    }

    public void addPoint(Point point) {
        if(point == null)
            throw new IllegalArgumentException("point must be not null!");

        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0.0;
        for (int i = 1; i < points.size(); ++i) {
            length += points.get(i-1).getLength(points.get(i));
        }
        return length;
    }

}
