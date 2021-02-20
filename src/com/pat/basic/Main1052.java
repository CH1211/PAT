package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/20
 * @description
 */
public class Main1052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder shous = new StringBuilder();
        StringBuilder yans = new StringBuilder();
        StringBuilder kous = new StringBuilder();

        for(int i = 0; i <= 2; i++){
            String str1 = br.readLine();
            Pattern pattern = Pattern.compile("\\[(.+?)\\]");
            Matcher matcher = pattern.matcher(str1);
            while(matcher.find()){
                if(i == 0){
                    shous.append(matcher.group(1)).append(".");
                }else if(i == 1){
                    yans.append(matcher.group(1)).append(".");
                }else{
                    kous.append(matcher.group(1)).append(".");
                }
            }
        }
        String[] shou = String.valueOf(shous).split("\\.");
        String[] yan = String.valueOf(yans).split("\\.");
        String[] kou = String.valueOf(kous).split("\\.");

        int num = Integer.parseInt(br.readLine());
        StringBuilder[] s = new StringBuilder[num];
        int index = 0;
        while(num > 0){
            String[] tmp = br.readLine().split(" ");
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < tmp.length; i++){
                if(i == 0 || i == 4){
                    if(Integer.parseInt(tmp[i]) > shou.length || Integer.parseInt(tmp[i]) <= 0){
                        res.replace(0, res.length(),"Are you kidding me? @\\/@");
                        break;
                    }else{
                        res.append(shou[Integer.parseInt(tmp[i]) - 1]);
                    }
                }else if(i == 1 || i == 3){
                    if(Integer.parseInt(tmp[i]) > yan.length || Integer.parseInt(tmp[i]) <= 0){
                        res.replace(0, res.length(),"Are you kidding me? @\\/@");
                        break;
                    }else{
                        if(i == 1){
                            res.append("(");
                        }
                        res.append(yan[Integer.parseInt(tmp[i]) - 1]);
                        if(i == 3){
                            res.append(")");
                        }
                    }
                }else{
                    if(Integer.parseInt(tmp[i]) > kou.length){
                        res.replace(0, res.length(),"Are you kidding me? @\\/@");
                        break;
                    }else{
                        res.append(kou[Integer.parseInt(tmp[i]) - 1]);
                    }
                }
            }
            s[index] = res;
            num--;
            index++;
        }

        for(StringBuilder sb : s){
            System.out.println(sb);
        }
    }
}
