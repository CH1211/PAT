package com.pat.basic;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/27
 * @description
 */
public class Main1041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Map<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

        while (count > 0) {
            String str = scanner.next();
            int shiji = scanner.nextInt();
            int kaoshi = scanner.nextInt();
            map.put(shiji, new ArrayList<String>(Arrays.asList(str, String.valueOf(kaoshi))));
            count--;
        }
        int num = scanner.nextInt();
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        while (num > 0) {
            int tmp = scanner.nextInt();
            res.add(map.get(tmp));
            num--;
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).get(0) + " " + res.get(i).get(1));
        }
    }


}













