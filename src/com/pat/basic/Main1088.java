package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/18
 * @description
 */
public class Main1088 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int mine = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        int y = Integer.parseInt(str[2]);

        int a = 0;
        int b = 0;
        int c = 0;
        int tag = 0;
        for(int i = 48; i <= 99; i++){
            StringBuilder tmp = new StringBuilder();
            tmp.append(i);
            int tmp_b = Integer.parseInt(String.valueOf(tmp.reverse()));
            int tmp_c = Math.abs(i - tmp_b) / x;
            if(tmp_b == tmp_c * y){
                a = i;
                b = tmp_b;
                c = tmp_c;
                tag = 1;
            }
        }
        if(tag == 0){
            System.out.println("No Solution");
        }else{
            System.out.print(mine);
            System.out.print(" ");
            func(mine, a);
            System.out.print(" ");
            func(mine, b);
            System.out.print(" ");
            func(mine, c);
        }
    }

    public static void func(int a, int b){
        if(a > b){
            System.out.print("Gai");
        }else if(a == b){
            System.out.print("Ping");
        }else{
            System.out.print("Cong");
        }

    }
}
