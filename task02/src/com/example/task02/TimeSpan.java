package com.example.task02;

public class TimeSpan {
    private int second;
    private int minute;
    private int hour;

    public TimeSpan(int hour, int minute, int second ){

        this.second = second;
        this.minute = minute;
        this.hour = hour;
        norm_time();


    }

    private void norm_time() {
        if (this.hour >= 0) {
            if (this.second > 59) {
                if (this.second == 60) {
                    this.minute++;
                    this.second = 0;
                } else {
                    int dop_minute = this.second / 60;
                    this.second = this.second % 60;
                    this.minute = this.minute + dop_minute;
                }
            }
            if (this.minute > 59) {
                if (this.minute == 60) {
                    this.hour++;
                    this.minute = 0;
                } else {
                    int dop_hour = this.minute / 60;
                    this.minute = this.minute % 60;
                    this.hour = this.hour + dop_hour;
                }
            }
            if (this.second < 0) {
                if (this.minute > 0) {
                    this.second = this.minute * 60 + this.second;
                    this.minute = this.second / 60;
                    this.second = this.second % 60;
                } else {
                    this.second = this.hour * 60 * 60 + this.second;
                    this.minute = this.second / 60;
                    this.second = this.second % 60;
                    if (this.minute > 59) {
                        if (this.minute == 60) {
                            this.hour++;
                            this.minute = 0;
                        } else {
                            int dop_hour = this.minute / 60;
                            this.minute = this.minute % 60;
                            this.hour = this.hour + dop_hour;
                        }
                    }
                }


                }
            if (this.minute < 0 ) {
                if (this.hour != 0) {
                    this.minute = this.hour * 60 + this.minute;
                    this.hour = this.minute / 60;
                    this.minute = this.minute % 60;
                }
                else {
                    System.exit(-1);
                }
            }

        } else {
            System.exit(-2);
        }
        if (this.second < 0 | this.minute < 0 | this.hour < 0){
            System.exit(-3);
        }
    }


    public int get_second(){
        return this.second;
    }
    public int get_minute(){
        return this.minute;
    }
    public int get_hour(){
        return this.hour;
    }

    public void set_seconds(int second){
        this.second=second;
    }
    public void set_minutes(int minute){
        this.minute=minute;
    }
    public void set_Hours(int hour){
        this.hour=hour;
    }

    public void add(TimeSpan time){
        int sec;
        int min;
        int h;
        sec = time.second;
        min = time.minute;
        h = time.hour;
        this.second = this.second + sec;
        this.minute = this.minute + min;
        this.hour = this.hour + h;
        norm_time();
    }

    public void subtract(TimeSpan time){
        int sec;
        int min;
        int h;
        sec = time.second;
        min = time.minute;
        h = time.hour;
        this.second = this.second - sec;
        this.minute = this.minute - min;
        this.hour = this.hour - h;
        norm_time();
    }
    public String toString(){
        return String.format("[%d:%d:%d]", this.hour, this.minute, this.second);
    }




}
