package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/21
 * @description
 */
public class Main1059 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<String, Integer>();
        int index = 1;
        while(index <= num){
            String tmp = br.readLine();
            map.put(tmp, index);
            index++;
        }

        int count = Integer.parseInt(br.readLine());
        Map<String, Integer> tag = new HashMap<String, Integer>();
        String[] id = new String[count];
        String[] res = new String[count];
        int i = 0;
        while(i < count){
            id[i] = br.readLine();
            i++;
        }
        for(int j = 0; j < count; j++){
            if(map.containsKey(id[j])){
                if(tag.containsKey(id[j])){
                    res[j] = "Checked";
                }else{
                    int rank = map.get(id[j]);
                    if(rank == 1){
                        res[j] = "Mystery Award";
                    }else if(isPrime(rank)){
                        res[j] = "Minion";
                    }else{
                        res[j] = "Chocolate";
                    }
                    tag.put(id[j], 1);
                }
            }else{
                res[j] = "Are you kidding?";
            }
        }
        for(int k = 0; k < count; k++){
            System.out.println(id[k] + ": " + res[k]);
        }
    }

    public static boolean isPrime(int id){
        boolean tag = true;
        if(id == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(id); i++){
            if(id % 2 == 0){
                tag = false;
            }
        }
        return tag;
    }
}


















