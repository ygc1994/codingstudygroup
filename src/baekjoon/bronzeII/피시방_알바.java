package baekjoon.bronzeII;

import java.util.Scanner;

/* 피시방 알바 - 백준 (1453) */
public class 피시방_알바 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* 손님의 수 */
        int N = sc.nextInt();

        /* 1번부터 100번까지 자리 체크를 할 수 있는 배열 */
        int[] seat = new int[100];
        int[] guest = new int[N];
        /* 거절 당하는 사람의 수 */
        int count = 0;

        for (int i = 0; i < N; i++) {
            guest[i] = sc.nextInt();
        }

        for (int i = 0; i < 100; i++) {
            if(i == N) break;

            if(seat[guest[i] - 1] == 0) {
                /* 들어온 사람이 자리를 차지하면 1 */
                seat[guest[i] - 1] = 1;
            /* 이미 자리가 있다면 count를 1씩 증가 */
            } else count++;
        }

        System.out.println(count);

    }

}