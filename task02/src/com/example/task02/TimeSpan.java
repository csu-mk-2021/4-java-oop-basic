package com.example.task02;

public class TimeSpan {
    private int hours=0;
    private int minutes=0;
    private int seconds=0;

    public TimeSpan(int hours,int minutes,int seconds){
        if (hours < 0) {
            throw new IllegalArgumentException("hours are negative");
        }
        if (minutes < 0) {
            throw new IllegalArgumentException("minutes are negative");
        }
        if (seconds < 0) {
            throw new IllegalArgumentException("seconds are negative");
        }
        int carry=seconds/60;
        seconds%=60;
        minutes+=carry;
        carry=minutes/60;
        minutes%=60;
        hours+=carry;
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    };

    public int getHours(){
        return this.hours;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public int getSeconds(){
        return this.seconds;
    }

    public void setHours(int hours){
        if(hours<0)
            throw new IllegalArgumentException("hours are negative");
        this.hours=hours;
    }

    public void setMinutes(int minutes){
        if (minutes < 0) {
            throw new IllegalArgumentException("minutes are negative");
        }
        this.minutes=minutes;
        if(minutes >= 60)
            normalize(toSeconds());
    }

    public void setSeconds(int seconds)
    {
        if (seconds < 0) {
            throw new IllegalArgumentException("seconds are negative");
        }
        this.seconds=seconds;
        if(seconds>=60)
            normalize(toSeconds());
    }

    public void add(TimeSpan time){
        if (time != null) {
            this.normalize(this.toSeconds() - time.toSeconds());
            return;
        }
        throw new IllegalArgumentException("pointer is null");
    }
    private int toSeconds()
    {
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }
    private void normalize(int seconds)
    {
        this.seconds= seconds % 60;
        this.minutes = seconds / 60 % 60;
        this.hours = seconds / (60 * 60);
    }

    public void subtract(TimeSpan time) {
        if (time != null ){
            this.normalize(this.toSeconds()-time.toSeconds());
            return;
        }
        throw new IllegalArgumentException("pointer is null");
    }

    public String toString() {
        return String.format("[%d:%d:%d]", hours, minutes, seconds);
    }
}