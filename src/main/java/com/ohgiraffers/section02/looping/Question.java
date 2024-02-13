package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Question {

    /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
    *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6

     */

    public static void main(String[] args) {


        /* 1부터 10까지의 숫자를 출력하는 프로그램 */

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);

        }

        /* 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 */

        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }

        /* 구구단 7단을 출력하는 프로그램 */

        for (int i = 1; i <= 9; i++) {
            System.out.println(" 7 * " + i + " = " + ( 7 * i ) );

        }

        /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */
        for (int i = 1; i <= 100 ; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }


        }
 /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램 */

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요.");

        int num = sc.nextInt();

        int multi = 1;

        for (int i = num ; i >= 1 ; i--) {

            System.out.println("i :" + i);
            System.out.println("multi : "+ multi);

            multi *= i;   // 누적해 저장하려고 만든 식 / i를 계속 곱해줘야 하기 때문에

            // multi = multi * i

        }

        System.out.println("총 :" + multi);
    }
}
