package com.example.task03;

public class Complex {

    double x = 0;
    double y = 0;

    public Complex() {
    }

    public Complex(double x) {
        this.x = x;
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex(Complex complex) {
        this.x = complex.x;
        this.y = complex.y;
    }

    public Complex add(Complex complex) {
        Complex result = new Complex(this);
        result.x += complex.x;
        result.y += complex.y;
        return result;
    }

    public Complex sub(Complex complex) {
        Complex result = new Complex(this);
        result.x -= complex.x;
        result.y -= complex.y;
        return result;
    }

    public Complex mult(Complex complex) {
        double x = this.x * complex.x - this.y * complex.y;
        double y = this.x * complex.y + this.y * complex.x;
        return new Complex(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.x + " + " + this.y + "i";
    }
}
