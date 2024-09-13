package baekjoon.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 최댓값 - 백준 (2562) */
public class 최댓값 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 입력 개수는 9개로 고정되어 있으니 아래와 같이 바로 배열을 선언 */
        int[] natnum = new int[9];
        int[] max = new int[9];

        /* for 구문으로 배열의 원소를 하나씩 입력 */
        for (int i = 0; i < 9; i++) {
            natnum[i] = Integer.parseInt(br.readLine());
            max[i] = natnum[i];
        }

        /* Arrays.sort()로 배열을 인자로 전달하면 오름차순으로 정렬 */
        Arrays.sort(max);

        /* 최댓값 출력 */
        System.out.println(max[8]);

        /* 특정 인덱스의 위치 i 값을 출력
        * i + 1인 이유는 배열 안의 저장소 위치는 0부터 시작 */
        for (int i = 0; i < 9; i++) {
            if(natnum[i] == max[8]) {
                System.out.println(i + 1);

                break;
            }
        }

    }

}