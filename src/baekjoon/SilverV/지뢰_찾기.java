package baekjoon.SilverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 지뢰 찾기 - 백준 (1996) */
public class 지뢰_찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        /* 지뢰 찾기 map에 대한 정보 */
        String info = "";
        int[][] infoarr = new int[N][N];
        /* 완성된 지뢰 찾기 map */
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            info = br.readLine();

            for (int j = 0; j < N; j++) {
                /* 만약 지뢰가 없는 곳이라면 0 입력 */
                if(info.charAt(j) == '.') {
                    infoarr[i][j] = 0;
                } else infoarr[i][j] = Integer.parseInt(String.valueOf(info.charAt(j)));

                /* 숫자 주위에 해당 숫자만큼 증가
                * 배열 범위를 넘어가지 않게 조건 부여 */
                if(i - 1 >= 0) {
                    map[i - 1][j] += infoarr[i][j];

                    if(j - 1 >= 0) map[i - 1][j - 1] += infoarr[i][j];

                    if(j + 1 < N) map[i - 1][j + 1] += infoarr[i][j];
                }

                if(j + 1 < N) map[i][j + 1] += infoarr[i][j];

                if(j - 1 >= 0) map[i][j - 1] += infoarr[i][j];

                if(i + 1 < N) {
                    map[i + 1][j] += infoarr[i][j];

                    if(j - 1 >= 0) map[i + 1][j - 1] += infoarr[i][j];

                    if(j + 1 < N) map[i + 1][j + 1] += infoarr[i][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                /* 지뢰는 * 출력 */
                if(infoarr[i][j] > 0) {
                    System.out.print('*');
                /* 10 이상인 경우는 M 출력 */
                } else if(map[i][j] >= 10) {
                    System.out.print('M');
                } else System.out.print(map[i][j]);
            }

            System.out.println();
        }

    }

}