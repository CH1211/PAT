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
public class Main1045 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        int[] arr = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < count; i++){
            boolean tag = true;
            if(i == 0){
                for(int j = 1; j < count; j++){
                    if(arr[j] < arr[i]){
                        tag = false;
                        break;
                    }
                }
            }else if(i == count - 1){
                for(int j = count - 2; j >= 0; j--){
                    if(arr[j] > arr[i]){
                        tag = false;
                        break;
                    }
                }
            }else{
                for(int m = i - 1; m >= 0; m--){
                    if(arr[i] < arr[m]){
                        tag = false;
                    }
                }
                for(int n = i + 1; n <= count - 1; n++){
                    if(arr[i] > arr[n]){
                        tag = false;
                    }
                }
            }
            if(tag){
                res.add(arr[i]);
            }
        }
        System.out.println(res.size());
        res.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        String[] s = new String[res.size()];
        for(int k = 0; k < res.size(); k++){
            s[k] = String.valueOf(res.get(k));
        }
        System.out.println(String.join(" ", s));
    }
}
















