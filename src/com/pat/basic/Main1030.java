package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/24
 * @description
 */
public class Main1030 {

    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String[] numStr = br.readLine().split(" ");
        int count = Integer.parseInt(numStr[0]);
        int p = Integer.parseInt(numStr[1]);
    }
}
