package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/19
 * @description
 */
public class Main1062 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String[] str1 = str[0].split("/");
        String[] str2 = str[1].split("/");
        int k = Integer.parseInt(str[2]);
        int n1 = Integer.parseInt(str1[0]);
        int m1 = Integer.parseInt(str1[1]);
        int n2 = Integer.parseInt(str2[0]);
        int m2 = Integer.parseInt(str2[1]);

        double res1 = Math.min((double)n1 / m1, (double)n2 / m2);
        double res2 = Math.max((double)n1 / m1, (double)n2 / m2);
        StringBuilder res = new StringBuilder();
        double tmp = 0.0;
        for(int i = 1; i < k; i++){
            int tag = 0;
            if(i == 1){
                tmp = (double)i / k;
                if(tmp > res1 && tmp < res2){
                    res.append(i).append("/").append(k).append(" ");
                }
            }else{
                for(int j = 2; j <= i; j++){
                    if(i % j == 0 && k % j == 0){
                        tag = 1;
                        break;
                    }
                }
                tmp = (double)i / k;
                if(tag == 0 && tmp > res1 && tmp < res2){
                    res.append(i).append("/").append(k).append(" ");
                }
            }
        }
        System.out.println(res.substring(0, res.length() - 1));
    }
}
