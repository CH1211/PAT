package com.pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ch
 * @version 1.0
 * @date 2021/03/06
 * @description
 */
public class Main1041 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < str.length; i++){
            int key = Integer.parseInt(str[i]);
            if(!map.containsKey(key)){
                map.put(key, 1);
            }else{
                int value = map.get(key);
                map.put(key, value + 1);
            }
        }

        boolean tag = false;
        String res = "None";
        for(int j = 1; j < str.length; j++){
            if(map.get(Integer.parseInt(str[j])) == 1){
                tag = true;
                res = str[j];
                break;
            }
        }
        System.out.println(res);
    }
}





















