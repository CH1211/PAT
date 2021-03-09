package com.pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/03/06
 * @description
 */
public class Main1027 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] earth = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder("#");
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7" ,"8", "9", "A", "B", "C"};
        for (int i = 0; i < earth.length; i++){
            int tmp = Integer.parseInt(earth[i]);
            int a = tmp / 13;
            int b = tmp % 13;
            sb.append(num[a]).append(num[b]);
        }
        System.out.println(sb);
    }
}
