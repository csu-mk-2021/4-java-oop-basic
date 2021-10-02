package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex p1=new Complex(10,10);
        Complex p2=new Complex(10,10);
        Complex p3=p1.add(p2);
        Complex p4=p1.mul(p2);
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
