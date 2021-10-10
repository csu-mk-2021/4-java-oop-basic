package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(54, 65, 10);
        TimeSpan t2 = new TimeSpan(49, 0, 0);

        //System.out.println(t1.toString());

    //    System.out.println((t1.substract(t2)).toString());

        System.out.println(t2.substract(t1).toString());
    }
}
