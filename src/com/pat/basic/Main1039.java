package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/22
 * @description
 */
public class Main1039 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sale = br.readLine();
        String buy = br.readLine();
        int count = 0;
        Map<Character, Integer> saleMap = new HashMap<Character, Integer>();
        Map<Character, Integer> buyMap = new HashMap<Character, Integer>();
        for(int i = 0; i < buy.length(); i++){
            Character tmp = buy.charAt(i);
            if(!buyMap.containsKey(tmp)){
                buyMap.put(tmp, 1);
            }else{
                int value = buyMap.get(tmp);
                buyMap.put(tmp, value + 1);
            }
        }

        for(int j = 0; j < sale.length(); j++){
            Character c = sale.charAt(j);
            if(!buyMap.containsKey(c)){
                count++;
            }else{
                int value = buyMap.get(c);
                if(value == 1){
                    buyMap.remove(c);
                }else{
                    buyMap.put(c, value - 1);
                }
            }
        }
        if(buyMap.isEmpty()){
            System.out.println("Yes " + count);
        }else{
            int sum = 0;
            for(int i : buyMap.values()){
                sum += i;
            }
            System.out.println("No " + sum);
        }
    }
}
