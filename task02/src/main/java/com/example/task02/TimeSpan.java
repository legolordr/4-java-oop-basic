package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        normalize();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    void add(TimeSpan span) {
        this.hour += span.hour;
        this.minute += span.minute;
        this.second += span.second;
        normalize();
    }

    void subtract(TimeSpan span) {
        this.hour -= span.hour;
        this.minute -= span.minute;
        this.second -= span.second;
        normalize();
    }


    private void normalize() {

        minute += second / 60;
        second = second % 60;


        hour += minute / 60;
        minute = minute % 60;

        if (second < 0) {
            second += 60;
            minute -= 1;
        }
        if (minute < 0) {
            minute += 60;
            hour -= 1;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}