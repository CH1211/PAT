package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/21
 * @description
 */
public class Main1015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int total = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[1]);
        int max = Integer.parseInt(str[2]);
        int[][] student = new int[total][4];        //最后一位为标记位，表示该生属于什么类型
        int index = 0;
        while(index < total){
            String[] tmp = br.readLine().split(" ");
            String id = tmp[0];
            String de = tmp[1];
            String cai = tmp[2];
            int tag =
            index++;
        }
    }
}
