package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Practice {

    public void weight () {

        Scanner sc = new Scanner(System.in);

        System.out.println("몸무게를 입력해주세요. ");
        int num = sc.nextInt();

        if ( num > 70 ) {

            System.out.println("샐러드 잡솨");
        }
        System.out.println( "프로그램을 종료합니다.");

    }
}
