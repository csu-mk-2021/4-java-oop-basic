package com.example.task03;

import java.sql.SQLOutput;
import java.util.ConcurrentModificationException;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(32, -43);
        Complex c2 = new Complex(6, 54);

        System.out.println(c1.sum(c2).toString());
        System.out.println(c1.mul(c2).toString());
        System.out.println(c2.mul(c1).toString());
        System.out.println(c2.mul(c2).toString());
    }
}
