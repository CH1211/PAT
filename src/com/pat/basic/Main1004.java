package com.pat.basic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2020/09/15
 * @description
 */
public class Main1004 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();
        reader.nextLine();
        while (count > 0) {
            String str = reader.nextLine();
            map.put(Integer.parseInt(str.split(" ")[2]), str);
            count--;
        }

        int max = Collections.max(map.keySet());
        int min = Collections.min(map.keySet());

        System.out.println(map.get(max).split(" ")[0] + " " + map.get(max).split(" ")[1]);
        System.out.println(map.get(min).split(" ")[0] + " " + map.get(min).split(" ")[1]);

    }
}
