package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/14
 * @description
 */
public class Main1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int total = Integer.parseInt(num[0]);
        int interval = Integer.parseInt(num[1]);
        int start = Integer.parseInt(num[2]) - 1;

        String[] names = new String[total];
        int index = 0;

        String[] res = new String[total];
        int i = 0;

        while(index < total){
            String str = br.readLine();
            names[index] = str;
            index++;
        }
        int tag = 0;
        while(start < total){
            if(i == 0){
                res[i] = names[start];
                start += interval;
                i++;
                continue;
            }
            if(isExist(res, names[start], i)){
                while(isExist(res, names[start], i)){
                    start++;
                    if(start >= total){
                        tag = 1;
                        break;
                    }
                }
                if(tag == 1){
                    break;
                }else{
                    res[i] = names[start];
                }
            }else{
                res[i] = names[start];
            }
            start += interval;
            i++;
        }
        if(i == 0){
            System.out.println("Keep going...");
        }else{
            for(String tmp : res){
                if(tmp != null){
                    System.out.println(tmp);
                }
            }
        }
    }

    public static boolean isExist(String[] arr, String name, int num){
        boolean tag = false;
        for(int i = 0; i < num; i++){
            if(arr[i].equals(name)){
                tag = true;
            }
        }
        return tag;
    }
}
