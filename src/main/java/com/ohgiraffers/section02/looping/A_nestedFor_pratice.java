package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor_pratice {

    public void printDollorsInputRowTimes() {

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수 : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {

            for(int k = 1; k <= 7; k++ ) {

                System.out.println(" $ ");
            }

            System.out.println();
        }

    }
}
