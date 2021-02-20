package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/28
 * @description
 */
public class Main1048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder num1 = new StringBuilder(str[0]).reverse();
        StringBuilder num2 = new StringBuilder(str[1]).reverse();
        int i = 0;
        for(; i < num1.length(); i++){
            int tmp = 0;
            if((i + 1) % 2 == 0){
                tmp = (Integer.parseInt(String.valueOf(num2.charAt(i))) - Integer.parseInt(String.valueOf(num1.charAt(i))));
                if(tmp < 0){
                    tmp += 10;
                }
                if(tmp == 10){
                    sb.append("J");
                }else if(tmp == 11){
                    sb.append("Q");
                }else if(tmp == 12){
                    sb.append("K");
                }else{
                    sb.append(tmp);
                }
            }
            if((i + 1)  % 2 == 1){
                tmp = (Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(i)))) % 13;
                if(tmp == 10){
                    sb.append("J");
                }else if(tmp == 11){
                    sb.append("Q");
                }else if(tmp == 12){
                    sb.append("K");
                }else{
                    sb.append(tmp);
                }
            }
        }
        while (i < num2.length()){
            sb.append(num2.charAt(i));
            i++;
        }
        System.out.println(sb.reverse());
    }
}
