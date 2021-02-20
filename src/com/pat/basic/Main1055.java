package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/18
 * @description
 */
public class Main1055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int count = Integer.parseInt(str[0]);
        int column = Integer.parseInt(str[1]);
        String[] names = new String[column];
        int[] highs = new int[column];
        int index = 0;
        while (index < column){
            int i = index;
            String[] tmp = br.readLine().split(" ");
            String name = tmp[0];
            int high = Integer.parseInt(str[1]);
            if(i == 0){
                names[i] = name;
                highs[i] = high;
            }else{
                int pos = 0;
                for(int j = 0; j <= i; j++){
                    if(high > highs[j]){
                        pos = j;
                    }
                }
            }

            index++;
        }
    }
}
