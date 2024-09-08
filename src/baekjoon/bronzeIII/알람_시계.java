package baekjoon.bronzeIII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 알람 시계 - 백준 (2884) */
public class 알람_시계 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /* 입력 받은 분(M)을 45분을 기준으로, 45분보다 작으면 H를 -1 해 주고, 아닐 경우 M에 -45 */
        if(M < 45) {
            H--;
            /* 분은 60분이니 만약 입력값이 45분보다 작을 경우, 60 - (45 - 입력값)을 M에 입력 */
            M = 60 - (45 - M);

            /* H가 0보다 작아질 경우, H를 23으로 수정 */
            if(H < 0) H = 23;

            System.out.println(H + " " + M);
        } else System.out.println(H + " " + (M - 45));

    }

}