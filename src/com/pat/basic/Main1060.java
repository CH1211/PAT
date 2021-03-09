package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/25
 * @description
 */
public class Main1060 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[num];
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length; i++){
            int tmp = Integer.parseInt(str[i]);
            if(!map.containsKey(tmp)){
                arr[count] = tmp;
                count++;
                map.put(tmp, 1);
            }else{
                int value = map.get(tmp);
                map.put(tmp, value + 1);
            }
        }

        int res = 0;
        int total_day = 0;
        for(int index = 0 ; index < count; index++){
            int tmp_total = 0;
            int tmp_res = arr[index];
            for(int j = 0; j < count; j++){
                if(arr[index] <= arr[j]){
                    tmp_total += map.get(arr[j]);
                }
            }
            if(tmp_res <= tmp_total && tmp_res >= res){
                res = tmp_res;
            }
        }
        System.out.println(res);
    }
}
