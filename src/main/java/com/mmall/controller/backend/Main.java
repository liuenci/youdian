package com.mmall.controller.backend;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String flag = "YES";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                flag = "NO";
            }
        }
        System.out.println(flag);
    }
}
