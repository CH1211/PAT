package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/16
 * @description
 */
public class Main1093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        StringBuilder res = new StringBuilder();
        Map<Character, Character> map = new HashMap<Character, Character>(){};

        for(int i = 0; i < a.length(); i++){
            if(map.get(a.charAt(i))==null){
                res.append(a.charAt(i));
                map.put(a.charAt(i), '1');
            }
        }

        for(int j = 0; j < b.length(); j++){
            if(map.get(b.charAt(j))==null){
                res.append(b.charAt(j));
                map.put(b.charAt(j), '1');
            }
        }
        System.out.println(res);
    }
}
