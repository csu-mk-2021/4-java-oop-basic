package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        Complex_num c_num1 = new Complex_num(2, 5);
        System.out.println(c_num1.toString());
        Complex_num c_num2 = new Complex_num(2, 8);
        Complex_num c_num3 = new Complex_num();
        c_num3 = c_num1.sum(c_num2);
        Complex_num c_num4 = new Complex_num();
        c_num4 = c_num1.mul(c_num2);
        System.out.println(c_num1.toString());
        System.out.println(c_num2.toString());
        System.out.println(c_num3.toString());
        System.out.println(c_num4.toString());
    }
}
