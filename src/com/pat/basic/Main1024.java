package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/24
 * @description
 */
public class Main1024 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("E");
        StringBuilder res = new StringBuilder();

        int index = Integer.parseInt(str[1].substring(1));
        String tag = str[0].substring(0, 1);
        String num = str[0].substring(1);
        if(tag.equals("-")){
            res.append("-");
            str[0] = str[0].substring(1);
        }

        if(str[1].charAt(0) == '-'){
            if(index == 0){
                res.append(str[0]);
            }else{
                res.append(0).append(".");
                for(int i = 1; i < index; i++){
                    res.append(0);
                }
                res.append(num.charAt(0)).append(num.substring(2));
            }
        }else{
            if(index == 0){
                res.append(str[0]);
            }else{
                res.append(num.substring(0,1));
                if(num.substring(2).length() > index){
                    res.append(num.substring(2, 2 + index));
                    res.append(".");
                    res.append(num.substring(2 + index));
                }else{
                    res.append(num.substring(2));
                    for(int i = 0; i < index - num.substring(2).length(); i++){
                        res.append(0);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
