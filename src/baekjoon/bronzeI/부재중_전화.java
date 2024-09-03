package baekjoon.bronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 부재중 전화 - 백준 (1333) */
public class 부재중_전화 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        /* 전화벨을 들을 수 있는 가장 빠른 시간 */
        int time = 0;

        time = D;

        label:
        while(true) {
            /* 쉬는 시간 사이에서 전화가 울릴 때 */
            for (int i = 0; i < N; i++) {
                if(time >= i * (L + 5) + L && time < i * (L + 5) + L + 5) {
                    System.out.println(time);

                    break label;
                }
            }

            /* 모든 노래가 끝난 후의 시간에 전화가 울리는 경우 */
            if(time >= N * L + 5 * (N - 1)) {
                System.out.println(time);

                break;
            }

            time += D;
        }

    }

}