package baekjoon.bronzeIII;

import java.util.Scanner;

/* 상금 헌터 - 백준 (15953) */
public class 상금_헌터 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] intarr = new int[T];
        
        /* 각 등수에 맞는 명 수로 조건을 걸고, 조건에 따라서 상금을 더해 저장 */
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = 0;

            /* 진출하지 못 했을 경우도 조건 안에 포함
            * 조건문을 너무 많이 사용*/
            if(a == 1) {
                sum += 5000000;
            } else if(a > 1 && a <= 3) {
                sum += 3000000;
            } else if (a > 3 && a <= 6) {
                sum += 2000000;
            } else if (a > 6 && a <= 10) {
                sum += 500000;
            } else if (a > 10 && a <= 15) {
                sum += 300000;
            } else if (a > 15 && a <= 21) {
                sum += 100000;
            } else sum += 0;

            if(b == 1) {
                sum += 5120000;
            } else if(b > 1 && b <= 3) {
                sum += 2560000;
            } else if (b > 3 && b <= 7) {
                sum += 1280000;
            } else if (b > 7 && b <= 15) {
                sum += 640000;
            } else if (b > 15 && b <= 31) {
                sum += 320000;
            } else sum += 0;

            intarr[i] = sum;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(intarr[i]);
        }

    }

}