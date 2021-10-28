package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
        //System.out.println(deep);
    }

    public static int getStackTraceDeep() {
        int count = 0;
        StackTraceElement[]stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements){
            count++;
        }
        System.out.println(count);
        return count;
    }
}

