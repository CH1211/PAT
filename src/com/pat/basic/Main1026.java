package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/12
 * @description
 */
public class Main1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = (int) Math.round((double)(b - a) / 100);
        int hour = c / 60  / 60;
        int min = (c - hour * 60 * 60) / 60;
        int second = c - hour * 60 * 60 - min * 60;

        String newHour = String.valueOf(hour);
        String newMin = String.valueOf(min);
        String newSecond = String.valueOf(second);

        if(hour < 10){
            newHour = "0" + hour;
        }
        if(min < 10){
            newMin = "0" + min;
        }
        if(second < 10){
            newSecond = "0" + second;
        }
        System.out.println(newHour + ":" + newMin + ":" + newSecond);

    }
}
