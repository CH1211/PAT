package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/16
 * @description
 */
public class Main1053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int total = Integer.parseInt(str[0]);
        double e = Double.parseDouble(str[1]);
        int day = Integer.parseInt(str[2]);
        int may = 0;
        int must = 0;
        int index = 0;
        while (index < total){
            String[] tmp = br.readLine().split(" ");
            int num = Integer.parseInt(tmp[0]);
            int low = 0;
            for(int i = 1; i < num; i++){
                if(Double.parseDouble(tmp[i]) < e){
                    low++;
                }
            }
            if(num <= day && low > num / 2){
                may++;
            }
            if(num > day && low > num / 2){
                must++;
            }
            index++;
        }
        System.out.printf("%.1f", (double)may/total * 100);
        System.out.print("% ");
        System.out.printf("%.1f", (double)must/total * 100);
        System.out.print("%");
        System.out.println();
    }
}
