package baekjoon.SilverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 뒤집기 - 백준 (1439) */
public class 뒤집기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        char[] ch;
        /* 행동의 최소 횟수 */
        int count = 0;
//        int ztoc = 0;
//        int otzc = 0;

        ch = new char[S.length()];

        /* 입력한 문자열을 배열에 입력 */
        for (int i = 0; i < S.length(); i++) {
            ch[i] = S.charAt(i);
        }

        if(ch[0] == '0') {
            /* 전부 0으로 바뀔 때, 행동의 횟수 증가 */
            for (int i = 0; i < S.length(); i++) {
                if(i == S.length() - 1) break;

                if(ch[i] - ch[i + 1] == -1) count++;
            }
        } else {
            /* 전부 1로 바뀔 때, 행동의 횟수 증가 */
            for (int i = 0; i < S.length(); i++) {
                if(i == S.length() - 1) break;

                if(ch[i] - ch[i + 1] == 1) count++;
            }
        }

        System.out.println(count);
//        for (int i = 0; i < S.length(); i++) {
//            if(i == S.length() - 1) break;
//
//            if(ch[i] - ch[i + 1] == -1) {
//                ztoc++;
//            } else if(ch[i] - ch[i + 1] == 1) otzc++;
//        }
//
//        if(ztoc > otzc) {
//            System.out.println(ztoc);
//        } else System.out.println(otzc);

    }

}