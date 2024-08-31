package baekjoon.bronzeIII;

import java.math.BigInteger;
import java.util.Scanner;

/* 사탕 선생 고창영 - 백준 (2547) */
public class 사탕_선생_고창영 {

    public static void main(String[] args) {

        /* 테스트 케이스의 개수 T 입력 받기 */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String[] strarr = new String[T];

        sc.nextLine();

        /* T만큼 for 문 반복 */
        for (int i = 0; i < T; i++) {
            /* 학생의 수 N 입력 받기 */
            int N = sc.nextInt();
            /* 사탕 개수를 더할 변수
            * 조건 중 학생들이 가져온 사탕 개수는 10^18보다 작거나 같다. (학생들이 가져온 사탕 개수의 합은 10^18을 넘어갈 수 있다)로 int
            * 형을 넘어 BigInteger 사용*/
            BigInteger sum = new BigInteger("0");

            for (int j = 0; j < N; j++) {
                Long candy = sc.nextLong();

                /* BigInteger 메소드 add를 사용하여 입력 받은 사탕 개수를 sum에 더하기 */
                sum = sum.add(BigInteger.valueOf(candy));
            }

            /* BigInteger 메소드인 나머지를 구하는 mod를 사용하여 나머지가 0이면 YES, 0이 아니면 NO */
            if(sum.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) {
                strarr[i] = "YES";
            } else strarr[i] = "NO";
        }

        for (int i = 0; i < T; i++) {
            System.out.println(strarr[i]);
        }

    }

}