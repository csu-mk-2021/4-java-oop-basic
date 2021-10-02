package com.example.task05;

import java.util.Objects;
/**
 * Точка в двумерном пространстве
 */
public class Point {
        private double x, y;    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public Point(double x, double y) {
        /**
         * Возвращает координату точки по оси абсцисс
         *
         * @return координату точки по оси X
         */
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        Objects.requireNonNull(point);
        this.x = point.x;
        this.y = point.y;
    }
    public double getX() {
        // TODO: реализовать
        return this.x;
    }



    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        // TODO: реализовать
        return this.y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        // TODO: реализовать
        Objects.requireNonNull(point);
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

}
