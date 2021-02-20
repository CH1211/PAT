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
public class Main1066 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int lines = Integer.parseInt(str[0]);
        int num = Integer.parseInt(str[1]);
        int start = Integer.parseInt(str[2]);
        int end = Integer.parseInt(str[3]);
        int replace = Integer.parseInt(str[4]);

        String[][] res = new String[lines][num];

        int i = 0;
        while(i < lines){
            String[] strs = br.readLine().split(" ");
            for(int j = 0; j < num; j++){
                int tmp = Integer.parseInt(strs[j]);
                if(start <= tmp && tmp <= end){
                    res[i][j] = String.format("%03d", replace);
                }else{
                    res[i][j] = String.format("%03d", tmp);
                }
            }
            i++;
        }

        for(int m = 0; m < lines; m++){
            for(int n = 0; n < num; n++){
                System.out.print(res[m][n]);
                if(n != num -1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
