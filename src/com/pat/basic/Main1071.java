package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/13
 * @description
 */
public class Main1071 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int chip = Integer.parseInt(str[0]);
        int count = Integer.parseInt(str[1]);
        while (count > 0){
            count--;
            String[] number = br.readLine().split(" ");
            int n1 = Integer.parseInt(number[0]);
            int b = Integer.parseInt(number[1]);
            int t = Integer.parseInt(number[2]);
            int n2 = Integer.parseInt(number[3]);
            if(t > chip){
                System.out.println("Not enough tokens.  Total = " + chip + ".");
                continue;
            }
            if(b == 0 && n1 > n2){
                chip += t;
                System.out.println("Win " + t + "!  Total = " + chip + ".");
                continue;
            }
            if(b == 0 && n1 < n2){
                chip -= t;
                System.out.println("Lose " + t + ".  Total = " + chip + ".");
                if(chip == 0){
                    System.out.println("Game Over.");
                    break;
                }
                continue;
            }

            if(b == 1 && n1 < n2){
                chip += t;
                System.out.println("Win " + t + "!  Total = " + chip + ".");
                continue;
            }

            if(b == 1 && n1 > n2){
                chip -= t;
                System.out.println("Lose " + t + ".  Total = " + chip + ".");
                if(chip == 0){
                    System.out.println("Game Over.");
                    break;
                }
                continue;
            }
        }

    }
}
