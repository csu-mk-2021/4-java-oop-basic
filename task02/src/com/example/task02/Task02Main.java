package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan p1 = new TimeSpan(4,-4, 16);
        String str = p1.toString();
        System.out.println(str);
        TimeSpan p2 = new TimeSpan(8, 5, 4);
        p1.add(p2);
        str = p1.toString();
        System.out.println(str);
        TimeSpan p3 = new TimeSpan(9, 0, 0);
        p1.subtract(p3);
        str = p1.toString();
        System.out.println(str);
        int h = p1.get_hour();
        System.out.println(h);
        p1.set_minutes(25);
        str = p1.toString();
        System.out.println(str);

    }
}
