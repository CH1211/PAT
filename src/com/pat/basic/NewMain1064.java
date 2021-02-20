package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/10
 * @description
 */
public class NewMain1064 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] number = br.readLine().split(" ");    // n个正整数

        boolean[] friends = new boolean[37];        // 朋友证号最大为36
        int theNumberOfFriends = 0;                    // 朋友证号的个数
        for (int i = 0; i < n; ++i) {
            char[] num = number[i].toCharArray();    // 第i个正整数
            int friendNumber = 0;                    // 第i个正整数的朋友证号
            for (int j = 0; j < num.length; ++j) {
                friendNumber += num[j] - 48;        // 每一位的和
            }
            if (!friends[friendNumber]) {    // 新的朋友证号
                ++theNumberOfFriends;                // 个数加1
                friends[friendNumber] = true;        // 设为已存在
            }
        }

        System.out.println(theNumberOfFriends);
        for (int i = 0, j = 0; i < 37; ++i) {
            if (friends[i]) {
                System.out.print(i);
                if ((++j) < theNumberOfFriends) {    // 不是最后一个朋友证号
                    System.out.print(" ");            // 空格分隔
                }
            }
        }
    }

}
