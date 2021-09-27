package com.example.task02;

public class Task02Main {

    private int second;
    private int minute;
    private int hour;

    public Task02Main() {}

    public Task02Main(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        this.minute += this.second / 60;
        this.second %= this.second % 60;

        this.hour += this.minute / 60;
        this.minute %= 60;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void add(TimeSpan time) {

    }

    public void subtract(TimeSpan time) {

    }

    @Override
    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public static void main(String[] args) {

    }
}
