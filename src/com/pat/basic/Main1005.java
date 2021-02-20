package com.pat.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author ch
 * @version 1.0
 * @date 2020/09/15
 * @description
 */
public class Main1005 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> ver = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int count = sc.nextInt();
        sc.nextLine();
        while (count > 0) {
            int tmp = sc.nextInt();
            nums.add(tmp);
            ver.addAll(func(tmp));
            count--;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (!ver.contains(nums.get(i))) {
                res.add(nums.get(i));
            }
        }
        Collections.sort(res);
        Collections.reverse(res);
        System.out.println(res.stream().map(s -> "" + s + "").collect(Collectors.joining(" ")));


    }

    public static ArrayList<Integer> func(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (3 * num + 1) / 2;
            }
            list.add(num);
        }
        return list;
    }
}
