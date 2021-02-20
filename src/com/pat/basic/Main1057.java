package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/14
 * @description
 */
public class Main1057 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int num = 0;
        for(int i = 0; i< str.length(); i++){
            if(String.valueOf(str.charAt(i)).matches("[A-Z]")){
                num += str.charAt(i) - 'A' + 1;
            }
            if(String.valueOf(str.charAt(i)).matches("[a-z]")){
                num += str.charAt(i) - 'a' + 1;
            }
        }
        String s = Integer.toBinaryString(num);
        int count1 = 0;
        int count2 = 0;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == '0'){
                count1++;
            }
            if(s.charAt(j) == '1'){
                count2++;
            }
        }
        System.out.println(count1 + " " + count2);
    }
}
