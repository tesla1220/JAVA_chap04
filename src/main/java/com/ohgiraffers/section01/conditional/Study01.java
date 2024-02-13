package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Study01 {

    public static void main(String[] args) {

        /* 60점 이상이면 합격을 판단하는 프로그램을 작성해보자.

점수가 0미만 100초과이면 경고문구 (”잘못 입력하셨습니다.”) 출력 */

        Scanner sc = new Scanner(System.in);
        System.out.println(" 점수를 입력 ");;

        int score = sc.nextInt();

        String msg = "잘못 입력하셨습니다. ";

        if ( score < 0 || score > 100 ) {
            System.out.println("잘못 입력하셨습니다. ");
        } else {
            if( score >= 60) {
                System.out.println("합격입니다. ");

            } else {
                System.out.println("불합격입니다. ");
            }
        }


    }


}
