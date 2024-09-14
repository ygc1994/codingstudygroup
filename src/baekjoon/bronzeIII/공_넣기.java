package baekjoon.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 공 넣기 - 백준 (10810) */
public class 공_넣기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /* N만큼 크기를 가진 배열
        * 바구니의 번호는 배열의 인덱스 번호 + 1 */
        int[] basket = new int [N + 1];
        int i = 0;
        int j = 0;
        int k = 0;

        /* 공을 넣는 행위를 M번 반복 */
        for (int l = 0; l < M; l++) {
            st = new StringTokenizer(br.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            /* i번 바구니부터 j번 바구니까지에 k번 공을 넣는다는 뜻 */
            for (; i <= j; i++) {
                basket[i] = k;
            }
        }

        /* 1번 바구니부터 N번 바구니에 들어 있는 공의 번호를 공백으로 구분해 출력
        * 공이 들어 있지 않은 바구니(비어 있는 배열)는 기본값 0을 출력 */
        for (int l = 1; l <= N; l++) {
            System.out.print(basket[l] + " ");
        }

    }

}