package com.pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/03/01
 * @description
 */
public class Main1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        StringBuilder sum = new StringBuilder(String.valueOf(a + b)).reverse();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < sum.length(); i++){
            res.append(sum.charAt(i));
            if((i + 1) % 3 == 0 && (i + 1) != sum.length() && sum.charAt(i + 1) != '-'){
                res.append(",");
            }
        }
        System.out.println(res.reverse());
    }
}
