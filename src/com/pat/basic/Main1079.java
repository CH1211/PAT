package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/22
 * @description
 */
public class Main1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int count = 10;
        if(isPalindrome(num)){
            System.out.println(num + " is a palindromic number.");
        }else{
            while (count > 0){
                StringBuilder tmp = new StringBuilder(num).reverse();
                StringBuilder res = new StringBuilder();
                int carry = 0;
                for(int i = 0; i < tmp.length(); i++){
                    int i1 = Integer.parseInt(String.valueOf(num.charAt(i)));
                    int i2 = Integer.parseInt(String.valueOf(tmp.charAt(i)));
                    int a;
                    if(carry == 0){
                        a = i1 + i2;
                    }else{
                        a = i1 + i2 + 1;
                    }
                    if(a >= 10){
                        carry = 1;
                        res.append(a % 10);
                    }else{
                        carry = 0;
                        res.append(a);
                    }
                }
                if(carry > 0){
                    res.append(carry);
                }
                System.out.println(num + " + " + tmp + " = " + res.reverse());
                if(isPalindrome(String.valueOf(res))){
                    System.out.println(res + " is a palindromic number.");
                    break;
                }
                num = String.valueOf(res);
                count--;
            }
            if(count == 0){
                System.out.println("Not found in 10 iterations.");
            }
        }


    }

    public static boolean isPalindrome(String str){
        boolean tag = true;
        for(int i = 0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                tag = false;
                break;
            }
        }
        return tag;
    }
}
