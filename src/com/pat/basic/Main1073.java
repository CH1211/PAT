package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/21
 * @description
 */
public class Main1073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int student = Integer.parseInt(str[0]);
        int problem = Integer.parseInt(str[1]);
        String[][] answer = new String[problem][4];
        int index = 0;
        while(index < problem){
            String[] tmp = br.readLine().split(" ");
            answer[index][0] = tmp[0];
            answer[index][1] = tmp[1];
            answer[index][2] = tmp[2];
            StringBuilder sb = new StringBuilder();
            for(int i = 3; i < tmp.length; i++){
                sb.append(tmp[i]);
            }
            answer[index][3] = String.valueOf(sb);
            index++;
        }

        double[] grade = new double[student];

    }
}
