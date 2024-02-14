package com.ohgiraffers.section02.looping;

public class MakingStars {

    /* 별 만들기 게임
     *   *
     *   **
     *   ***
     *   ****
     *   *****
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */
    public void test7() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 별 만들기 게임
     *      *
     *     ***
     *    *****
     *   *******
     *
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */
    public void test8() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /* 별 만들기 게임
     *       *
     *     ***
     *    ****
     *   *****
     *
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */
    public void test9() {
        for (int i = 6; i > 0; i--) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /* 별 만들기 게임
     *      *
     *     ***
     *    *****
     *   *******
     *
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */

    public void test10(){

        int num = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }
            num = num +2;
            System.out.println();
        }
    }
}