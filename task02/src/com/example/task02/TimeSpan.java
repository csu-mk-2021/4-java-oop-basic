package com.example.task02;

public class TimeSpan {
    private long seconds;
    private TimeSpan() {; }
    private long mktime(int h, int m, int s) {
        long seconds = s;
        seconds += m * 60;
        seconds += h * 3600;
        return seconds;
    }
    public long getSeconds() { return seconds; }
//Допускаем любые значения аргументов
    public TimeSpan(int h, int m, int s) {
        seconds = mktime(h, m, s);
    }

    public TimeSpan add(TimeSpan t2) {
        if(t2 == null)
            throw new IllegalArgumentException("t2 must be not NULL!");

        this.seconds += t2.getSeconds();
        return this;
    }

    public TimeSpan subtract(TimeSpan t2) {
        if(t2 == null)
            throw new IllegalArgumentException("t2 must be not NULL!");

        this.seconds -= t2.getSeconds();
        return this;
    }

    //out: "hours.minutes.seconds"
    public String toString() {
        String res = String.valueOf(seconds / 3600);//hours
        res = res.concat(".");
        res = res.concat(String.valueOf(seconds / 60 % 60));//minutes
        res = res.concat(".");
        res = res.concat(String.valueOf(seconds % 60));//seconds
        return res;
    }
}
