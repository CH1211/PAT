package com.pat.basic;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/14
 * @description
 */
public class Main1028 {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String youngest = "";
        String oldest = "";
        int max = 0;
        int min = 200;

        int count = 0;
        while(num > 0){
            String[] str = br.readLine().split(" ");
            String[] date = str[1].split("/");
            String name = str[0];
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            if(func(year, month, day)){
                count++;
                int tmp = 2014 - year;
                if(max < tmp){
                    max = tmp;
                    oldest = name;
                }
                if(min > tmp){
                    min = tmp;
                    youngest = name;
                }
            }
            num--;
        }
        if(count != 0){
            System.out.println(count + " " + oldest + " " + youngest);
        }else{
            System.out.println("0");
        }
    }

    public static boolean func(int year, int month, int day){
        if(year > 1814 && year < 2014){
            return true;
        }else if(year == 1814){
            if(month > 9){
                return true;
            }else if(month == 9){
                if(day >= 6){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else if(year == 2014){
            if(month < 9){
                return true;
            }else if(month == 9){
                if(day <= 6){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
