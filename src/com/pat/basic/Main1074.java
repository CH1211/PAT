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
public class Main1074 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder(br.readLine()).reverse();
        StringBuilder num1 = new StringBuilder(br.readLine()).reverse();
        StringBuilder num2 = new StringBuilder(br.readLine()).reverse();
        int i = 0;
        int j = 0;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int index = 0;
        while(i < num1.length() && j < num2.length()){
            int base = 0;
            if (Integer.parseInt(String.valueOf(str.charAt(index))) == 0){
                base = 10;
            }else {
                base = Integer.parseInt(String.valueOf(str.charAt(index)));
            }

            int tmp = carry + Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(i)));
            if(tmp >= base){
                carry = 1;
            }else {
                carry = 0;
            }
            res.append(tmp % base);
            i++;
            j++;
            index++;
        }

        while (i < num1.length()){
            int base = 0;
            if (Integer.parseInt(String.valueOf(str.charAt(index))) == 0){
                base = 10;
            }else {
                base = Integer.parseInt(String.valueOf(str.charAt(index)));
            }
            int tmp = carry + Integer.parseInt(String.valueOf(num1.charAt(i)));
            if(tmp > base){
                carry = 1;
            }else{
                carry = 0;
            }
            res.append(tmp % base);
            i++;
            index++;
        }

        while (j < num2.length()){
            int base = 0;
            if (Integer.parseInt(String.valueOf(str.charAt(index))) == 0){
                base = 10;
            }else {
                base = Integer.parseInt(String.valueOf(str.charAt(index)));
            }
            int tmp = carry + Integer.parseInt(String.valueOf(num2.charAt(j)));
            if(tmp > base){
                carry = 1;
            }else{
                carry = 0;
            }
            res.append(tmp % base);
            j++;
            index++;
        }
        if(res.reverse().charAt(0) == '0'){
            if(carry > 0){
                System.out.println(carry + res.substring(1));
            }else{
                System.out.println(res.substring(1));
            }
        }else{
            if(carry > 0){
                System.out.println(String.valueOf(carry) + res);
            }else{
                System.out.println(res);
            }
        }
    }
}
