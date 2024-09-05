package baekjoon.SilverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 지뢰 찾기 - 백준 (1094) */
public class 막대기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int stick = 64;
        /* 막대를 자르고 붙이는 과정을 진행하여 Xcm의 막대를 만드는 막대 개수 */
        int count = 0;

        while(X > 0) {
            if (stick > X) {
                stick /= 2;
            } else {
                X -= stick;
                count++;
            }
        }

        System.out.println(count);

    }

}