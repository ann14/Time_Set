package com.company;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(){}
    public Time(int hh,int mm,int ss){
        if(hh>=0&&hh<=24){
            hour=hh;
        }
        if(mm>=0&&mm<60){
            minute=mm;
        }
        if(ss>=0&&ss<60){
            second=ss;
        }

    }
    public Time(int hh,int mm){
        this(hh,mm,0);

    }
    public Time(int hh){
        this(hh,0,0);

    }
    public String toString(){
        return String.format("Time: %d: %d: %d",hour,minute,second);
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
        if(hour>=0&&hour<=24) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if(minute>=0&&minute<60) {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if(second>=0&&second<60) {
            this.second = second;
        }
    }
    public boolean isMorning(){
        boolean mm = false;
        if(hour>=6&&hour<12){
            mm=true;
        }
        return  mm;

    }
    public boolean isAfternoon(){
        boolean aa = false;
        if(hour>13&&hour<18){
            aa=true;
        }
        return  aa;

    }
    public boolean isNoon(){
        boolean nn = false;
        if(hour>=12&&hour<=13){
            nn=true;
        }
        return  nn;

    }
    public boolean isEvening(){
        boolean ee = false;
        if(hour>=18||hour<6){
            ee=true;
        }
        return  ee;

    }
}
