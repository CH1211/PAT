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
public class Main1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        String[] res = new String[count];
        int index = 0;
        while (index < count){
            for(int i = 1; i < 10; i++){
                int tmp = i * Integer.parseInt(str[index]) * Integer.parseInt(str[index]);
                int len = String.valueOf(str[index]).length();
                String sub = String.valueOf(tmp).substring(String.valueOf(tmp).length() - len);
                if(sub.equals(String.valueOf(str[index]))){
                    res[index] = String.valueOf(i) + " " + String.valueOf(tmp);
                    break;
                }else{
                    res[index] = "No";
                }
            }
            index++;
        }
        for (String s : res){
            System.out.println(s);
        }
    }
}






