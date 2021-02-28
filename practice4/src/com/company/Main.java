package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Time T1=new Time(0,0,0);
        System.out.println(T1);
        enterTime(T1);
        rightNow(T1);


    }
    public static void enterTime(Time T1){

        Scanner scn=new Scanner(System.in);

        System.out.print("enter hour: ");
        int hour=scn.nextInt();
        T1.setHour(hour);

        System.out.print("enter minute: ");
        int minute=scn.nextInt();
        T1.setMinute(minute);

        System.out.print("enter second: ");
        int second=scn.nextInt();
        T1.setSecond(second);
    }
    public static void rightNow(Time T1){
        System.out.println("Time: "+T1.getHour()+":"+T1.getMinute()+":"+T1.getSecond());
        System.out.println("Morning? "+T1.isMorning());
        System.out.println("Noon? "+T1.isNoon());
        System.out.println("Afternoon? "+T1.isAfternoon());
        System.out.println("Evening? "+T1.isEvening());
    }
}
