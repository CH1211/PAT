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
public class Main1078 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tag = br.readLine();
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        if(tag.equals("C")){
            int count = 0;
            String tmp = "";
            for(int i = 0; i < str.length(); i++){
                if(tmp.equals(String.valueOf(str.charAt(i)))){
                    count++;
                }else{
                    if(!tmp.isEmpty()){
                        if(count == 1){
                            sb.append(tmp);
                        }else{
                            sb.append(count).append(tmp);
                        }
                        count = 0;
                    }
                    tmp = String.valueOf(str.charAt(i));
                    count++;
                }
                if(i == str.length() - 1){
                    if(count == 1){
                        sb.append(tmp);
                    }else{
                        sb.append(count).append(tmp);
                    }
                }
            }
        }else{
            for(int i = 0; i < str.length(); i++){
                int count = 0;
                StringBuilder num = new StringBuilder();
                if(Character.isDigit(str.charAt(i))){
                    while(Character.isDigit(str.charAt(i))){
                        num.append(str.charAt(i));
                        i++;
                    }
                    for(int j = 0; j < Integer.parseInt(String.valueOf(num)); j++){
                        sb.append(str.charAt(i));
                    }
                }else{
                    sb.append(str.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
