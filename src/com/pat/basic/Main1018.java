package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/10
 * @description
 */
public class Main1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] resA = new int[3];
        int[] resB = new int[3];
        int[] a = new int[3];
        int[] b = new int[3];

        while (num > 0) {
            String[] str = br.readLine().split(" ");
            if (compare(str[0], str[1]) == 1) {
                if (str[0].equals("C")) {
                    resA[0]++;
                    resB[2]++;
                    a[0]++;
                }
                if (str[0].equals("J")) {
                    resA[0]++;
                    resB[2]++;
                    a[1]++;
                }
                if (str[0].equals("B")) {
                    resA[0]++;
                    resB[2]++;
                    a[2]++;
                }
            }

            if (compare(str[0], str[1]) == 0) {
                resA[1]++;
                resB[1]++;
            }

            if(compare(str[0], str[1]) == -1){
                if(str[1].equals("C")){
                    resA[2]++;
                    resB[0]++;
                    b[0]++;
                }
                if(str[1].equals("J")){
                    resA[2]++;
                    resB[0]++;
                    b[1]++;
                }
                if(str[1].equals("B")){
                    resA[2]++;
                    resB[0]++;
                    b[2]++;
                }
            }
            num--;
        }
        for(int i = 0; i <= 2; i++){
            System.out.print(resA[i]);
            if(i != 2){
                System.out.print(" ");
            }
        }
        System.out.println();

        for(int i = 0; i <= 2; i++){
            System.out.print(resB[i]);
            if(i != 2){
                System.out.print(" ");
            }
        }
        System.out.println();

        int maxA = 0;
        int maxB = 0;
        String letterA = "";
        String letterB = "";
        for(int i = 2; i >= 0; i--){
            if(a[i] > maxA){
                maxA = a[i];
                if(i == 0){
                    letterA = "C";
                }else if(i == 1){
                    letterA = "J";
                }else{
                    letterA = "B";
                }
            }
            if(b[i] > maxB){
                maxB = b[i];
                if(i == 0){
                    letterB = "C";
                }else if(i == 1){
                    letterB = "J";
                }else{
                    letterB = "B";
                }
            }
        }
        System.out.println(letterA + " " + letterB);
    }

    public static int compare(String s1, String s2) {
        if (s1.equals("C") && s2.equals("J")) {
            return 1;
        } else if (s1.equals("J") && s2.equals("B")) {
            return 1;
        } else if (s1.equals("B") && s2.equals("C")) {
            return 1;
        } else if (s1.equals("C") && s2.equals("C")) {
            return 0;
        } else if (s1.equals("J") && s2.equals("J")) {
            return 0;
        } else if (s1.equals("B") && s2.equals("B")) {
            return 0;
        } else {
            return -1;
        }
    }
}
