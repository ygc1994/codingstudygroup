package baekjoon.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 오븐 시계 - 백준 (2525) */
public class 오븐_시계 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        /* 요리 시간이 60분 이상이면, 시에 60분 단위로 더해야 할 테니 넘는 만큼 몫 값 더하기 */
        if(B + C >= 60) {
            A += (B + C) / 60;

            /* 시에는 24 이상일 경우 다시 0시부터 시작하도록 24를 뺀 뺄셈 연산이 필요 */
            if(A >= 24) A -= 24;

            /* 분을 구하기 위해서는 60으로 나눈 나머지 값 */
            System.out.println(A + " " + (B + C) % 60);
        } else System.out.println(A + " " + (B + C) % 60);

    }

}