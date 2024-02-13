package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {

        /* 두 과목의 평균이 60점 이상이면 합격
         * 한 과목이라도 40점 미만이면 불합격
         *
         * 2과목에 대한 값을 입력 받고 합계와 평균을 이용하여 구하시오.
         * ex) 영어 30, 수학 90
         */

        Question04 que = new Question04();
    }

    public void exam () {

        Scanner sc = new Scanner(System.in);
        System.out.println("영어와 수학 점수를 입력해주세요 : ");

        int eng = sc.nextInt();
        int math = sc.nextInt();

        int total = eng + math ;
        int avg = total / 2;

        if ( avg > 60 ){
            if ( eng < 40 || math < 40 ){
                System.out.println("불합격");
            } else {
                System.out.println("합격");
            }
        } else {
            System.out.println("불합격");
        }

    }

}
