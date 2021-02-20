package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/19
 * @description
 */
public class Main1063 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        double max = 0.0;
        while(num > 0){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            double sqrt = Math.sqrt(a * a + b * b);
            if(sqrt > max){
                max = sqrt;
            }
            num--;
        }
        System.out.printf("%.2f", max);
    }
}
