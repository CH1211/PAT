package com.pat.basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ch
 * @version 1.0
 * @date 2021/01/09
 * @description
 */
public class Main1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNum = scanner.nextInt();
        int questionNum = scanner.nextInt();
        int[] res = new int[peopleNum];

        scanner.nextLine();
        int[] score = new int[questionNum];
        int scoreIndex = 0;
        while (scoreIndex < questionNum) {
            score[scoreIndex] = scanner.nextInt();
            scoreIndex++;
        }

        int[] answer = new int[questionNum];
        int answerIndex = 0;
        while (answerIndex < questionNum) {
            answer[answerIndex] = scanner.nextInt();
            answerIndex++;
        }

        int index = 0;
        while (index < peopleNum) {
            int question = 0;
            while (question < questionNum) {
                int tmp = scanner.nextInt();
                if (tmp == answer[question]) {
                    res[index] += score[question];
                }
                question++;
            }
            index++;
        }
        for (int i = 0; i < peopleNum; i++) {
            System.out.println(res[i]);
        }
    }
}


























