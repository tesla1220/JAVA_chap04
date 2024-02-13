package com.ohgiraffers.section02.looping;

public class Question02 {

    public static void main(String[] args) {
        /* 0시 1분 ~ 23시 59분까지 분 단위로 순서대로 출력되게 만들어보자!!! */

        for (int i = 0; i < 24 ; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.println(i + "시" + j + "분 ");
            }

        }

    }
}
