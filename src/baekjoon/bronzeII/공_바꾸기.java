package baekjoon.bronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 공 바꾸기 - 백준 (10813) */
public class 공_바꾸기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /* N만큼 크기를 가진 배열
         * 바구니의 번호는 배열의 인덱스 번호 + 1 */
        int[] basket = new int[N + 1];
        int i = 0;
        int j = 0;
        /* 값을 서로 바꾸기 위해서 임시 변수 temp를 선언 */
        int temp = 0;

        /* 바구니에 적혀 있는 번호와 같은 번호가 적힌 공 입력 */
        for (int l = 1; l <= N; l++) {
            basket[l] = l;
        }

        /* 공을 바꾸는 행위를 M번 반복 */
        for (int l = 0; l < M; l++) {
            st = new StringTokenizer(br.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            /* 두 바구니, i번 바구니와 j번 바구니에 들어 있는 공을 교환 */
            temp = basket[j];
            basket[j] = basket[i];
            basket[i] = temp;
        }

        /* 1번 바구니부터 N번 바구니에 들어 있는 공의 번호를 공백으로 구분해 출력 */
        for (int l = 1; l <= N; l++) {
            System.out.print(basket[l] + " ");
        }

    }

}