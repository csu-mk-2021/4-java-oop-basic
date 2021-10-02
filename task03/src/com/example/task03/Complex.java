package com.example.task03;

public class Complex {

    private int x=0;
    private int y=0;

    Complex() {}

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public Complex add(Complex complex) {
        return new Complex(x + complex.x, y + complex.y);
    }

    public Complex mul(Complex complex) {
        return new Complex(x * complex.x - y * complex.y, y * complex.x + x * complex.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return String.format("[%d:%d]", x,y);
    }
}
