package baekjoon.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 곱셈 - 백준 (2588) */
public class 곱셈 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nn1 = Integer.parseInt(br.readLine());
        int nn2 = Integer.parseInt(br.readLine());

        /* 일의 자리의 경우 385 % 10을 해주면 10으로 나눠준 값의 나머지가 반환 */
        System.out.println(nn1 * (nn2 % 10));
        /* 십의 자리 8은 385 % 100을 해주면 85가 나오고, 이걸 10으로 나누면 8이 반환 */
        System.out.println(nn1 * (nn2 % 100 / 10));
        /* 백의 자리 3은 385 / 100을 하면 3 */
        System.out.println(nn1 * (nn2 / 100));
        /* 전체 더한 결과를 출력 */
        System.out.println(nn1 * (nn2 % 10) + nn1 * (nn2 % 100 / 10) * 10 + nn1 * (nn2 / 100) * 100);

    }

}