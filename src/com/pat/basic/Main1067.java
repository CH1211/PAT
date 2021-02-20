package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/18
 * @description
 */
public class Main1067 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String password = str[0];
        int count = Integer.parseInt(str[1]);
        String tmp = "";
        int index = 1;
        while(!tmp.equals("#")){
            tmp = br.readLine();
            if(tmp.equals("#")){
                break;
            }
            if(password.equals(tmp)){
                System.out.println("Welcome in");
                break;
            }else{
                System.out.println("Wrong password: " + tmp);           //如果当前密码是错误的
                if(index >= count){                                     //当错误次数到达时，要再输出一行，不能在读取以后再退出。
                    System.out.println("Account locked");
                    break;
                }
            }
            index++;
        }
    }
}
