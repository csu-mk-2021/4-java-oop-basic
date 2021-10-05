package com.example.task05;

import java.util.Objects;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    private double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {

        //throw new AssertionError();
        return this.x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {

        //throw new AssertionError();
        return this.y;

    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {

        Objects.requireNonNull(point);
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

}
