package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author ch
 * @version 1.0
 * @date 2021/03/05
 * @description
 */
public class Main1065 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int couple = Integer.parseInt(br.readLine());
        Map<String, String> coupleMap = new HashMap<>();
        while(couple > 0){
            String[] tmp = br.readLine().split(" ");
            coupleMap.put(tmp[0], tmp[1]);
            coupleMap.put(tmp[1], tmp[0]);
            couple--;
        }
        int people = Integer.parseInt(br.readLine());
        String[] costumer = br.readLine().split(" ");
        List<String> res = new ArrayList<>();
        for(int i = 0; i < people; i++){
            if(!coupleMap.containsKey(costumer[i])){
                res.add(costumer[i]);
            }else{
                if(!Arrays.asList(costumer).contains(coupleMap.get(costumer[i]))){
                    res.add(costumer[i]);
                }
            }
        }
        System.out.println(res.size());
        res.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(String.join(" ", res));
    }
}
