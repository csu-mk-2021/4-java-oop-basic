package com.example.task02;

public class TimeSpan {
    private int hours=0;
    private int minutes=0;
    private int seconds=0;

    public TimeSpan(){};

    public TimeSpan(int hours,int minutes,int seconds){

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
        this.hours=hours;
    }

    public void setMinutes(int minutes){
        this.minutes=minutes;
    }

    public void setSeconds(int seconds){
        this.seconds=seconds;
    }

    public void add(TimeSpan time)
    {
        this.normalize(this.toSeconds()-time.toSeconds());
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
    public void subtract(TimeSpan time)
    {
        this.normalize(this.toSeconds()-time.toSeconds());
    }

    public String toString() {
        return String.format("[%d:%d:%d]", hours, minutes, seconds);
    }
}