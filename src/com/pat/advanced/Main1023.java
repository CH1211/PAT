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
public class Main1023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < num.length(); i++){
            if(!map.containsKey(num.charAt(i))){
                map.put(num.charAt((i)), 1);
            }else{
                int value = map.get(num.charAt(i));
                map.put(num.charAt(i), value + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        StringBuilder tmp =new StringBuilder(num).reverse();
        for(int j = 0; j < tmp.length(); j++){
            int v = Integer.parseInt(String.valueOf(tmp.charAt(j))) * 2 + carry;
            if(v >= 10){
                carry = 1;
            }else{
                carry = 0;
            }
            sb.append(v % 10);
        }

        if(carry == 1){
            sb.append(1);
        }

        boolean tag = true;
        for(int k = 0; k < sb.length(); k++){
            if(!map.containsKey(sb.charAt(k))){
                tag = false;
                break;
            }else{
                int value = map.get(sb.charAt(k));
                if(value <= 0){
                    tag = false;
                    break;
                }else{
                    map.put(sb.charAt(k), value - 1);
                }
            }
        }
        if(tag){
            System.out.println("Yes");
            System.out.println(sb.reverse());
        }else{
            System.out.println("No");
        }
    }
}
