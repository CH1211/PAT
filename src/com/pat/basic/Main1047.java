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
public class Main1047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        while(num > 0){
            String[] str = br.readLine().split(" ");
            int team = Integer.parseInt(str[0].split("-")[0]);
            int member = Integer.parseInt(str[0].split("-")[1]);
            int score = Integer.parseInt(str[1]);
            if(map.containsKey(team)){
                int value = map.get(team);
                map.put(team, value + score);
            }else{
                map.put(team, score);
            }
            num--;
        }
        int max = 0;
        int champion = 0;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                champion = key;
            }
        }
        System.out.println(champion + " " + max);
    }
}
