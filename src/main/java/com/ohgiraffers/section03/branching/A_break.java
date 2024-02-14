package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement() {

        /* 수업목표. break문 사용에 대한 흐름을 이해하고 적용할 수 있따. */
        /* 필기.
        *   break 문은 반복문 내에서 사용한다.
        *   해당 반복문은 빠져나올 때 사용하며, 반복문의 조건문 판단 결과와 상관 없이
        *   반복문을 빠져나올 때 사용한다.
        *   일반적으로 if(조건식 {break;} 처럼 사용된다.
        *   단, switch 문은 반복문이 아니지만 예외적으로 사용된다.
        * */

        /* 필기. break문을 이용하여 무한루프를 사용한 1 ~ 100 까지 합계 구하기. */
        int sum = 0;

        int i = 1;
        while (true) {

            sum += i;

            /* 반복문 조건과 별개로 반복문을 빠져나오기 위한 조건을 다시 작성 */
            if(i == 100) {

                /* i가 100인 조건을 만족하는 경우 반복문을 빠져나옴 */
                break;

            }

            i++;


        }


        System.out.println("1부터 100까지의 합은 : " + sum + "입니다.");

    }

    public void testSimpleBreakStatement2() {

        /* break는 모든 반복문을 종료하는 것이 아닌 자신에게 인접한 반복문을 종료시킨다. */

        /* 예시. 구구단 2 ~ 9 단까지 출력
        *  각 단의 수가 5보다 큰 경우는 출력을 생략한다. */

        for (int dan = 2; dan < 10; dan++) {

            for(int su = 1; su < 10; su++) {

                if (su > 5) {

                    break;
                }

                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

            System.out.println();

        }
    }
}
