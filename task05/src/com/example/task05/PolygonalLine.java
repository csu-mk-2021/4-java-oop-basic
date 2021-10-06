package com.example.task05;

/**
 * Ломаная линия
 */
import java.util.*;
public class PolygonalLine {

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    private Vector <Point> points=new Vector<Point>();
    public void setPoints(Point[] points) {
        // TODO: реализовать
        this.points=new Vector <Point>();
        for(int i=0;i<points.length;i++)
        {
            Objects.requireNonNull(points[i]);
            this.points.add(new Point(points[i].getX(),points[i].getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        // TODO: реализовать
        this.points.add(new Point(point.getX(),point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        // TODO: реализовать
        this.points.add(new Point(x,y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        // TODO: реализовать
        double length = 0d;
        for (int i = 1; i < this.points.size(); i++) {
            length += this.points.get(i-1).getLength(this.points.get(i));
        }
        return length;
    }

}
