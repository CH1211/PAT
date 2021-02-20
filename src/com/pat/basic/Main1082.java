package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/02
 * @description
 */
public class Main1082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        double max = 0.0;
        double min = 10000;
        String champion = "";
        String rookie = "";
        while (num > 0) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            String id = str[0];
            double dis = Math.pow(a, 2) + Math.pow(b, 2);
            if (dis > max) {
                max = dis;
                rookie = id;
            }
            if (dis < min) {
                min = dis;
                champion = id;
            }
            num--;
        }
        System.out.println(champion + " " + rookie);
    }
}
