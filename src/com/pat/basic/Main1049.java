package com.pat.basic;

import java.awt.geom.Arc2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author ch
 * @version 1.0
 * @date 2020/12/26
 * @description
 */
public class Main1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String[] str = bufferedReader.readLine().split(" ");

        float sum = 0;
//        for(int i = 0; i < str.length; i++){
//            for(int j = i; j < str.length; j++){
//                for(int k = i; k <= j; k++){
//                    sum += Float.parseFloat(str[k]);
//                }
//            }
//        }

        for (int i = 0; i < num; i++) {
            sum += (i + 1) * Float.parseFloat(str[i]) * (num - i);
        }
        System.out.printf("%.2f", sum);
    }
}
