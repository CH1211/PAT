package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/23
 * @description
 */
public class Main1033 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str1.length(); i++){
            char c = str1.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            if(!map.containsKey(i)){
                map.put(c, 1);
            }
        }
        StringBuilder res = new StringBuilder();
        for(int j = 0; j < str2.length(); j++){
            char c = str2.charAt(j);
            if(!map.containsKey(c)){
                if(map.containsKey('+') && Character.isUpperCase(c)){
                    continue;
                }
                if(Character.isUpperCase(c) && map.containsKey(Character.toLowerCase(c))){
                    continue;
                }
                res.append(c);
            }
        }
        System.out.println(res);
    }
}
