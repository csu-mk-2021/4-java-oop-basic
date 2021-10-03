package com.example.task02;

public class TimeSpan {

    private int second;
    private int minute;
    private int hour;

    public TimeSpan() {}

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        time_format();
    }

    private void time_format() {
        this.minute += this.second / 60;
        this.second %= this.second % 60;

        this.hour += this.minute / 60;
        this.minute %= 60;

        if (second < 0) {
            minute--;
            second = 0;
        }
        if (minute < 0) {
            hour--;
            minute = 0;
        }
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
        time_format();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        time_format();
    }

    public void setSecond(int second) {
        this.second = second;
        time_format();
    }

    public void add(TimeSpan time) {
        this.hour += time.hour;
        this.minute += time.minute;
        this.second += time.second;
        time_format();
    }

    public void subtract(TimeSpan time) {
        this.second -= time.second;
        this.minute -= time.minute;
        this.hour -= time.hour;
        time_format();
    }

    @Override
    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}
