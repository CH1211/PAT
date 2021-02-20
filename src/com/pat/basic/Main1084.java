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
public class Main1084 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int number = Integer.parseInt(str[0]);
        int count = Integer.parseInt(str[1]);

        int index = 1;
        StringBuilder res= new StringBuilder(String.valueOf(number));
        while(index <= count - 1){
            StringBuilder tmp = new StringBuilder();
            for(int i = 0; i < res.length(); i++){
                if(i == res.length() - 1){
                    tmp.append(res.charAt(i)).append("1");
                }else{
                    if(res.charAt(i) != res.charAt(i+1)){
                        tmp.append(res.charAt(i)).append("1");
                    }else{
                        int total = 1;
                        while(res.charAt(i) == res.charAt(i+1)){
                            if(i == res.length() - 2){
                                total++;
                                i++;
                                break;
                            }
                            total++;
                            i++;
                        }
                        tmp.append(res.charAt(i-1)).append(total);
                    }
                }
            }
            res = tmp;
            index++;
        }
        System.out.println(res);
    }
}








