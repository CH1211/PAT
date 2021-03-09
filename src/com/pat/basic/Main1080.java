package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/28
 * @description
 */
public class Main1080 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int p = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        int n = Integer.parseInt(num[2]);

        Map<String, List<Integer>> map = new HashMap<>();
        while (p > 0){
            String[] str = br.readLine().split(" ");
            List<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(str[1]));
            map.put(str[0], list);
            p--;
        }
        while (m > 0){
            String[] str = br.readLine().split(" ");
            if(map.containsKey(str[0])){
                List<Integer> tmp = map.get(str[0]);
                tmp.add(Integer.parseInt(str[1]));
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(-1);
                list.add(Integer.parseInt(str[1]));
                map.put(str[0], list);
            }
            m--;
        }
        for(String key : map.keySet()){
            if(map.get(key).size() == 1){
                List<Integer> tmp = map.get(key);
                tmp.add(-1);
                map.put(key, tmp);
            }
        }
        while (n > 0){
            String[] str = br.readLine().split(" ");
            if(map.containsKey(str[0])){
                List<Integer> tmp = map.get(str[0]);
                tmp.add(Integer.parseInt(str[1]));
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(-1);
                list.add(-1);
                list.add(Integer.parseInt(str[1]));
                map.put(str[0], list);
            }
            n--;
        }
        for(String key : map.keySet()){
            if(map.get(key).size() == 2){
                List<Integer> tmp = map.get(key);
                tmp.add(-1);
                map.put(key, tmp);
            }
        }

        List<List<String>> res = new ArrayList<>();

        for(String key : map.keySet()){
            List<Integer> list = map.get(key);
            int Gp = list.get(0);
            int Gmt = list.get(1);
            int Gf = list.get(2);
            int G = 0;
            if(Gmt > Gf){
                G = (int)Math.round(Gmt * 0.4 + Gf * 0.6);
            }else{
                G = Gf;
            }
            if(Gp >= 200 && G >= 60){
                List<String> temp = new ArrayList<>();
                temp.add(key);
                temp.add(String.valueOf(G));
                res.add(temp);
            }
        }
        sort(res);
        for(List<String> l : res){
            System.out.print(l.get(0) + " ");
            List<Integer> list = map.get(l.get(0));
            String Gp = String.valueOf(list.get(0));
            String Gmt = String.valueOf(list.get(1));
            String Gf = String.valueOf(list.get(2));
            System.out.println(String.join(" ", Gp, Gmt, Gf, l.get(1)));
        }
    }

    public static void sort(List<List<String>> list){
        int len = list.size();
        for(int i = 0; i  < len - 1; i++){
            int max = i;
            for(int j = i + 1; j < len; j++){
                if(Integer.parseInt(list.get(j).get(1)) > Integer.parseInt(list.get(max).get(1))){
                    max = j;
                }
                if(Integer.parseInt(list.get(j).get(1)) == Integer.parseInt(list.get(max).get(1))){
                    if(list.get(j).get(0).compareTo(list.get(max).get(0)) < 0){
                        max = j;
                    }
                }
            }
            if(max != i){
                List<String> tem = list.get(i);
                list.set(i, list.get(max));
                list.set(max, tem);
            }
        }
    }
}









