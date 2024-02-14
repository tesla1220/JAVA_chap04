package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class While_For_Practice {

     /* 필기.
            [while문 표현식]
            초기식;
            while(조건식) {
                조건을 만족하는 경우 수행할 구문 (반복할 구문);
            }
         */




//    1부터 10까지 1씩 증가시키면서 (10번) i값을 출력하는 기본 반복문  */
    public static void test1() {


        int a = 1;
        while (a <= 10) {

            System.out.println(a);

            a++;
        }


    }
    /* 수업목표. while 문의 흐름을 이해하고 적용할 수 있다. (1)
     *   필기. 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기 */

    /* 필기.
     *   charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 반환하는 기능
     *   length() : String 클래스의 메소드로 문자열의 길이를 int 형으로 반환
     *   index : 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
     *   */

    public void test2() {

        Scanner sc = new Scanner(System.in);        // Scanner를 사용하여 출력창에 타이핑 가능하도록
        System.out.println("문자열을 입력해주세요 : ");
        String str = sc.nextLine();     // "문자열을 입력해주세요" 다음에 한 줄 띄게해줌


        System.out.println("================for문=======================");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            System.out.println(i + " : " + ch);
        }

        System.out.println("=====================while문======================");
        int index = 0;
        while (index < str.length()) {

            char ch = str.charAt(index);

            System.out.println(index + " : " + ch);

            index++;
        }

    }
    /* 1부터 10까지 출력 */
    public void test3() {

        int i = 1;
        while ( i <= 10 ) {

            System.out.println(i);

            i++;
        }

    }


//     while을 이용하여 10부터 1까지 카운트다운 출력
    public void test4() {

        int a = 10;
        while (  a >= 1) {

            System.out.println(a);
            a--;
        }
    }

    // while을 사용해 구구단 7단 출력

    public void test5() {

        int su = 1;
        while ( su <= 9 ) {
            System.out.println("7 * " + su + " = " + (7*su));
            su++;
        }
    }



    // 1부터 100까지 짝수만 출력
    public void test6 () {

        int i = 1;
        while ( i <= 100 ) {
            if ( i % 2 == 0 ){
                System.out.println(i);
            }
            i++;
        }

    }

}

