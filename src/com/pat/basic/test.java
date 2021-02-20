package com.pat.basic;

import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/03
 * @description
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String count = scanner.next();
        int index = 0;
        while (index < 1) {
            String tmp = scanner.nextLine();
            System.out.print(tmp + "*****");
            index++;
        }
    }
}
