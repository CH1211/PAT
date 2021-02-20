package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/13
 * @description
 */
public class Main1076 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(num > 0){
            String[] str = br.readLine().split(" ");
            for(int i = 0; i < str.length; i++){
                if(str[i].matches("[A-D]-T")){
                    sb.append(str[i].split("-")[0].charAt(0) - 'A' + 1);
                }
            }
            num--;
        }
        System.out.println(sb);
    }
}
