package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/15
 * @description
 */
public class Main1072 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int student = Integer.parseInt(str1[0]);
        int goods = Integer.parseInt(str1[1]);
        String[] number = br.readLine().split(" ");
        StringBuilder[] res = new StringBuilder[student];
        int worryStu = 0;
        int worryGoods = 0;

        int index = 0;
        while (student > 0){
            String[] tmp = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            int tag = 0;
            sb.append(tmp[0]).append(":");
            for(int i = 2; i < 2 + Integer.parseInt(tmp[1]); i++){
                for(int j = 0; j < goods; j++){
                    if(number[j].equals(tmp[i])){
                        sb.append(" ").append(number[j]);
                        worryGoods++;
                        tag = 1;
                    }
                }
            }

            if(tag == 1){
                worryStu++;
                res[index] = sb;
                index++;
            }
            student--;
        }

        for(StringBuilder s : res){
            if(s != null){
                System.out.println(s);
            }
        }
        System.out.println(worryStu + " " + worryGoods);
    }
}
