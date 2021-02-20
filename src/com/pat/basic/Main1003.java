package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/07
 * @description
 */
public class Main1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] res = new String[num];
        int index = 0;
        while (index < num) {
            String tmp = br.readLine();
            if (tmp.equals("PAT")) {
                res[index] = "YES";
            } else if (tmp.matches("[A\\s]+PAT[A\\s]+")) {
                res[index] = "YES";
            } else if (tmp.matches("[\\s]+P[\\s]+T[\\s]+")) {
                res[index] = "YES";
            } else if (tmp.matches("[A]*P[A]+T[A]*")) {
                res[index] = "YES";
            } else {
                res[index] = "NO";
            }
            index++;
        }
        for (String i : res) {
            System.out.println(i);
        }
    }
}
