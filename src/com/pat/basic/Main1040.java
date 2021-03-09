package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0R®®R
 * @date 2021/02/27R
 * @description
 */
public class Main1040 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'P'){
                for(int j = i + 1; j < str.length(); j++){
                    if(str.charAt(j) == 'A'){
                        for(int k = j + 1; k < str.length(); k++){
                            if(str.charAt(k) == 'T'){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count % 1000000007);
    }
}

