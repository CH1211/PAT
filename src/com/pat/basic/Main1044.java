package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/15
 * @description
 */
public class Main1044 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] res = new String[num];
        int index = 0;
        while (num > 0) {
            String str = br.readLine();
            if (str.matches("[0-9]+")) {
                int tmp = Integer.parseInt(str);
                int a = tmp / 13;
                int b = tmp % 13;
                if(a == 0){
                    res[index] = numSwitchMar(b);
                }else{
                    res[index] = numSwitchMar2(a) + " " + numSwitchMar(b);
                }
            }else {
                String[] arr = str.split(" ");
                if(arr.length == 1){
                    res[index] = String.valueOf(Integer.parseInt(marSwitchNum(arr[0])) * 13);
                }else{
                    res[index] = String.valueOf(Integer.parseInt(marSwitchNum(arr[0])) * 13 + Integer.parseInt(marSwitchNum(arr[1])));
                }
            }
            index++;
            num--;
        }
        for(String s : res){
            System.out.println(s);
        }
    }

    public static String numSwitchMar(int num) {

        String res = "";
        switch (num){
            case 0:
                res = "tret";
                break;
            case 1:
                res = "jan";
                break;
            case 2:
                res = "feb";
                break;
            case 3:
                res = "mar";
                break;
            case 4:
                res = "apr";
                break;
            case 5:
                res = "may";
                break;
            case 6:
                res = "jun";
                break;
            case 7:
                res = "jly";
                break;
            case 8:
                res = "aug";
                break;
            case 9:
                res = "sep";
                break;
            case 10:
                res = "oct";
                break;
            case 11:
                res = "nov";
                break;
            case 12:
                res = "dec";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        return res;
    }

    public static String numSwitchMar2(int num) {
        String res = "";
        switch (num){
            case 1:
                res = "tam";
                break;
            case 2:
                res = "hel";
                break;
            case 3:
                res = "maa";
                break;
            case 4:
                res = "huh";
                break;
            case 5:
                res = "tou";
                break;
            case 6:
                res = "kes";
                break;
            case 7:
                res = "hei";
                break;
            case 8:
                res = "elo";
                break;
            case 9:
                res = "syy";
                break;
            case 10:
                res = "lok";
                break;
            case 11:
                res = "mer";
                break;
            case 12:
                res = "jou";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        return res;
    }

    public static String marSwitchNum(String str) {
        String res = "";
        switch (str){
            case "tret":
                res = "0";
                break;
            case "jan":
                res = "1";
                break;
            case "feb":
                res = "2";
                break;
            case "mar":
                res = "3";
                break;
            case "apr":
                res = "4";
                break;
            case "may":
                res = "5";
                break;
            case "jun":
                res = "6";
                break;
            case "jly":
                res = "7";
                break;
            case "aug":
                res = "8";
                break;
            case "sep":
                res = "9";
                break;
            case "oct":
                res = "10";
                break;
            case "nov":
                res = "11";
                break;
            case "dec":
                res = "12";
                break;
            case "tam":
                res = "1";
                break;
            case "hel":
                res = "2";
                break;
            case "maa":
                res = "3";
                break;
            case "huh":
                res = "4";
                break;
            case "tou":
                res = "5";
                break;
            case "kes":
                res = "6";
                break;
            case "hei":
                res = "7";
                break;
            case "elo":
                res = "8";
                break;
            case "syy":
                res = "9";
                break;
            case "lok":
                res = "10";
                break;
            case "mer":
                res = "11";
                break;
            case "jou":
                res = "12";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + str);
        }
        return res;
    }

}
