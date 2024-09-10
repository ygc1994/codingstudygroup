package baekjoon.SilverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/* 다리 놓기 - 백준 (1010) */
public class 다리_놓기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        int N = 0;
        int M = 0;
        /* 다리를 지을 수 있는 경우의 수
        * Factorial(팩토리얼) 같이 큰 수를 나타내기 위해 BigInteger를 사용 */
        BigInteger[] noc = new BigInteger[T];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            /* 중복되면 안 되고, 서로 다른 n개에서 r개를 뽑는 것을 nCr 조합 공식
            * 즉, 위에서 주어지는 N과 M은 M개에서 N개를 뽑는 것이기 때문에 MCN
            * m! / ((m - n)! x n!) */
            noc[i] = fact(M).divide(fact(M - N).multiply(fact(N)));
        }

        for (int i = 0; i < T; i++) {
            System.out.println(noc[i]);
        }

    }

    /* Factorial 구하기 */
    public static BigInteger fact(int n) {

        if(n <= 1) return BigInteger.ONE;

        return fact(n - 1).multiply(new BigInteger("" + n));

    }

}