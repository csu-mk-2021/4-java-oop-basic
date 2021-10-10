package com.example.task03;

public class Complex {
    private double x;
    private double y;

    private Complex() {
        ;
    }

    public double getX() { return x;}
    public double getY() { return y;}

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex sum(Complex z2) {
        Complex sumRes = new Complex(
            x + z2.getX(),
            y + z2.getY()
        );
        return sumRes;
    }

    public Complex mul(Complex z2) {
        Complex mulRes = new Complex(
            x * z2.x - y * z2.y,
            x * z2.y + y * z2.getX()
        );
        return mulRes;
    }
    //out: "z=x+yj"
    public String toString() {
        String res = "z=";
        res = res.concat(String.valueOf(x));
        if(y >= 0)
            res = res.concat("+");
        res = res.concat(String.valueOf(y));
        res = res.concat("j");
        return res;
    }

}
