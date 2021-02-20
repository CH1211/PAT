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
public class Main1051 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]);
        double d = Double.parseDouble(str[3]);

        double newA = a * Math.cos(b);
        double newB = a * Math.sin(b);
        double newC = c * Math.cos(d);
        double newD = c * Math.sin(d);

        double tmp = newA * newD + newC * newB;

        String i = String.format("%.2f",newA * newC - newB * newD);
        String j = tmp >= 0 ? (String.format("+%.2fi", tmp)) : (String.format("%.2fi", tmp));

        if ("-0.00".equals(i)) {
            i = "0.00";
        }

        if ("-0.00i".equals(j)) {
            j = "+0.00i";
        }

        System.out.println(i + j);
    }
}
