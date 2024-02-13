package com.ohgiraffers.section02.looping;

public class Study {

    public static void main(String[] args) {

        /* 1부터 20까지의 홀수를 차례대로 출력 */

//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i+" ");
//            }
//            }


        /*
         *
         **
         ***
         ****
         *****
         위의 결과값이 나오도록 만들어 보기 */

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
