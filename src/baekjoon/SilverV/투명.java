package baekjoon.SilverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 투명 - 백준 (1531) */
public class 투명 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /* 100×100 크기의 모자이크를 표현하는 배열
        * 무조건 (1,1)부터 (100,100)까지의 좌표 평면 */
        int[][] painting = new int[101][101];
        /* 왼쪽 아래 모서리의 x, y좌표 : left under edge x, y-coordinate
        * 오른쪽 위 모서리의 x, y좌표 : right top edge x, y-coordinate */
        int luexc = 0;
        int lueyc = 0;
        int rtexc = 0;
        int rteyc = 0;
        /* 보이지 않는 그림의 개수 */
        int count = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            /* 4개의 좌표 입력 */
            luexc = Integer.parseInt(st.nextToken());
            lueyc = Integer.parseInt(st.nextToken());
            rtexc = Integer.parseInt(st.nextToken());
            rteyc = Integer.parseInt(st.nextToken());

            /* 해당 좌푯값을 사용해서 포함되는 영역의 값을 1씩 증가 */
            for (int j = luexc; j <= rtexc; j++) {
                for (int k = lueyc; k <= rteyc; k++) {
                    painting[j][k]++;
                }
            }
        }

        /* 배열의 모든 원소를 돌면서 M보다 값이 크다면, 보이지 않는 그림의 개수 1씩 증가 */
        for (int j = 1; j <= 100; j++) {
            for (int k = 1; k <= 100; k++) {
                if(painting[j][k] > M) count++;
            }
        }

        System.out.println(count);

    }

}