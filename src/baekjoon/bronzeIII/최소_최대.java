package baekjoon.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 최소, 최대 - 백준 (10818) */
public class 최소_최대 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        /* N을 입력 받아 해당 크기의 배열을 선언 */
        int[] intnum = new int[N];
        /* 최솟값과 최댓값 */
        int min = 0;
        int max = 0;

        /* 배열 원소에 각각 입력 받은 값 저장 */
        for (int i = 0; i < N; i++) {
            intnum[i] = Integer.parseInt(st.nextToken());
        }

        /* 비교를 위해 min, max에는 배열에 저장된 첫 번째 원소 값 저장 */
        min = intnum[0];
        max = intnum[0];

        /* 기존 min의 값보다 작은지, max의 값보다 큰지 비교 */
        for (int i = 1; i < N; i++) {
            if(min > intnum[i]) min = intnum[i];

            if(max < intnum[i]) max = intnum[i];
        }

        System.out.println(min + " " + max);

    }

}