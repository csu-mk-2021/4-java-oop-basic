package com.example.task03;
public class Complex_num {

    private double re;
    private double im;

    public Complex_num() {}
    public Complex_num(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex_num sum(Complex_num num) {
        return new Complex_num(num.re + this.re, num.im + this.im);
    }

    // умножение комплексных чисел по формуле: (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public Complex_num mul(Complex_num num) {
        double a = this.re, b = this.im, c = num.re, d = num.im;
        return new Complex_num(a * c - b * d, b * c + a * d);
    }

    public String toString() {
        return "(" + re + "+" + im + "i)";
    }
}

