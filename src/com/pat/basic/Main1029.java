package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/22
 * @description
 */
public class Main1029 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> res = new HashMap<>();

        for(int i = 0; i < str2.length(); i++){
            char c = str2.charAt(i);
            if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            if(!map.containsKey(c)){
                map.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < str1.length(); j++){
            char c = str1.charAt(j);
            if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            if(!map.containsKey(c)){
                if(!res.containsKey(c)){
                    res.put(c, 1);
                    sb.append(c);
                }
            }
        }
        System.out.println(sb);
    }
}
