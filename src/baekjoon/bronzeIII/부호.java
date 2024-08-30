package baekjoon.bronzeIII;

import java.math.BigInteger;
import java.util.Scanner;

/* 부호 - 백준 (1247) */
public class 부호 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] S = new char[3];

        /* for 문으로 3번 반복하고, 그 안에 for 문으로 각 횟수마다 처음 입력되는 값만큼 반복 */
        for (int i = 0; i < 3; i++) {
            /* Scanner에서 바로 BigInteger 사용 가능 */
            int N = sc.nextInt();
            /* 정수형에서 범위가 가장 큰 게 long 타입인데 이것보다 더 큰 값이 만들어 질 수 있기에 BigInteger를 사용 */
            BigInteger sum = new BigInteger("0");

            for (int j = 0; j < N; j++) {
                sum = sum.add(sc.nextBigInteger());
            }

            /* 사용 함수 compareTo 비교값인데 compareTo(0) == 1이면 +, == -1이면 -, == 0 이면 0을 출력 */
            if(sum.compareTo(BigInteger.ZERO) == 1) {
                S[i] = '+';
            } else if (sum.compareTo(BigInteger.ZERO) == -1) {
                S[i] = '-';
            } else S[i] = '0';
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(S[i]);
        }

    }

}