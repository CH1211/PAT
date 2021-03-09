package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/03
 * @description
 */
public class Main1014 {
    public static void main(String[] args) throws IOException {
        String[] week = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();

        String day = "";
        String hour = "";
        String minute = "";

        int i = 0;
        for (; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i) && Character.isUpperCase(str1.charAt(i))){
                day = String.valueOf(str1.charAt(i));
                break;
            }
        }

        for(; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i) && (String.valueOf(str1.charAt(i)).matches("[0-9]|[A-N]"))){
                hour = String.valueOf(str1.charAt(i));
            }
        }

        for(int j = 0; j < str3.length(); j++){
            if(str3.charAt(j) == str4.charAt(j) && String.valueOf(str3.charAt(j)).matches("[a-zA-Z]")){
                minute = String.valueOf(j);
                break;
            }
        }
        String resDay = week[(int) day.charAt(0) - (int)'A'];
        StringBuilder resHour = new StringBuilder();
        StringBuilder resMinute = new StringBuilder();
        if(hour.matches("[A-Z]")){
            resHour.append((int)hour.charAt(0) - (int)'A' + 10);
        }else{
            resHour.append(0).append(hour);
        }

        if(Integer.parseInt(minute) < 10){
            resMinute.append(0).append(minute);
        }else{
            resMinute.append(minute);
        }
        System.out.println(resDay + " " + resHour + ":" + resMinute);
    }
}










