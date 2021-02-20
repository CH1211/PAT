package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/18
 * @description
 */
public class Main1054 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int count = 0;
        double sum = 0;
        for(int i = 0; i < num; i++){
            if(str[i].matches("[0-9]+\\.[0-9]{0,2}") || str[i].matches("[0-9]+")){
                if(Double.parseDouble(str[i]) < -1000 || Double.parseDouble(str[i]) > 1000){
                    System.out.println("ERROR: " + str[i] + " is not a legal number");
                }else {
                    sum +=  Double.parseDouble(str[i]);
                    count++;
                }
            }else if(str[i].matches("-[0-9]+\\.[0-9]{0,2}") || str[i].matches("-[0-9]+")){
                if(Double.parseDouble(str[i]) < -1000 || Double.parseDouble(str[i]) > 1000){
                    System.out.println("ERROR: " + str[i] + " is not a legal number");
                }else {
                    sum +=  Double.parseDouble(str[i]);
                    count++;
                }
            }else{
                System.out.println("ERROR: " + str[i] + " is not a legal number");
            }
        }
        if(count == 0){
            System.out.println("The average of 0 numbers is Undefined");
        }else if(count == 1){
            System.out.printf("The average of " + count + " number is %.2f", sum/count);
            System.out.println();
        }else{
            System.out.printf("The average of " + count + " numbers is %.2f", sum/count);
            System.out.println();
        }
    }
}
