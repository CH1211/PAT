package com.pat.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/03/02
 * @description
 */
public class Main1005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        String[] words = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] res = new String[String.valueOf(sum).length()];
        for(int j = 0; j < String.valueOf(sum).length(); j++){
            res[j] = words[Integer.parseInt(String.valueOf(String.valueOf(sum).charAt(j)))];
        }
        System.out.println(String.join(" ", res));
    }
}
