package baekjoon.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 과제 안 내신 분..? - 백준 (5597) */
public class 과제_안_내신_분 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        /* 교실엔 학생이 30명이 있지만, 학생 명부엔 각 학생 별로 1번부터 30번까지 출석 번호가 붙어 있으니까 + 1 */
        boolean[] list = new boolean[31];

        /* 숙제 제출한 학생 출석 번호 입력 */
        for (int i = 0; i < 28; i++) {
            n = Integer.parseInt(br.readLine());

            /* 해당 학생 배열 인덱스를 true 설정 */
            list[n] = true;
        }

        for (int i = 1; i <= 30; i++) {
            /* 배열 인덱스(숙제 제출 학생)가 true가 아니면 출력 */
            if(!list[i]) System.out.println(i);
        }

    }

}