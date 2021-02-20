package com.pat.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author ch
 * @version 1.0
 * @date 2021/02/19
 * @description
 */
public class Main1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String[] p = str[0].split("\\.");
        String[] a = str[1].split("\\.");
        int pG = Integer.parseInt(p[0]);
        int pS = Integer.parseInt(p[1]);
        int pK = Integer.parseInt(p[2]);
        int aG = Integer.parseInt(a[0]);
        int aS = Integer.parseInt(a[1]);
        int aK = Integer.parseInt(a[2]);

        int resG = 0;
        int resS = 0;
        int resK = 0;

        if((pG > aG) || (pG == aG && pS > aS) || (pG == aG && pS == aS && pK > aK)){
            if(pK >= aK){
                resK = pK - aK;
            }else{
                pS -= 1;
                resK = pK + 29 - aK;
            }

            if(pS >= aS){
                resS = pS - aS;
            }else{
                pG -= 1;
                resS = pS + 17 - aS;
            }
            resG = -1 * (pG - aG);
        }else{
            if(aK >= pK){
                resK = aK - pK;
            }else{
                aS -= 1;
                resK = aK + 29 - pK;
            }

            if(aS >= pS){
                resS = aS - pS;
            }else{
                aG -= 1;
                resS = aS + 17 - pS;
            }
            resG = aG - pG;
        }
        System.out.println(resG + "." + resS + "." + resK);
    }
}
