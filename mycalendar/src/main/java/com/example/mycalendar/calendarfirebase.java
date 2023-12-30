package com.example.mycalendar;

public class calendarfirebase
{
    String day,time,message;
    boolean notification;
    int id;

    public calendarfirebase(){}

    public calendarfirebase(String day, String time, String message, boolean notification, int id) {
        this.day = day;
        this.time = time;
        this.message = message;
        this.notification = notification;
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}