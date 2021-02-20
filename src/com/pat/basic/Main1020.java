package com.pat.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author ch
 * @version 1.0
 * @date 2020/09/21
 * @description
 */
public class Main1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kind = scanner.nextInt();
        int tmp = kind;
        int demand = scanner.nextInt();
        ArrayList<Integer> store = new ArrayList<Integer>();
        ArrayList<Integer> prices = new ArrayList<Integer>();
        scanner.nextLine();
        while (kind > 0) {
            store.add(scanner.nextInt());
            kind--;
        }
        scanner.nextLine();
        while (tmp > 0) {
            prices.add(scanner.nextInt());
            tmp--;
        }

        double[] priceLevel = new double[3];
        TreeMap<Double, Integer> tm = new TreeMap<>(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i = 0; i <= 2; i++){
            priceLevel[i] = (double)(prices.get(i)) / store.get(i);
            tm.put(priceLevel[i], i);
        }

        double money = 0.0;
        int index = 0;
        while(demand > 0){
            if(store.get(tm.get(index)) > demand){

            }
        }

        System.out.println(store.toString());
        System.out.println(prices.toString());
        for (Double  key : tm.keySet()) {
            System.out.println("key :"+key+",對應的value："+tm.get(key));
        }

    }
}
