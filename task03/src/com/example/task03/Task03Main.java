package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        System.out.println(a.complexAdd(b));
        System.out.println(a.complexMul(b));
    }
}
