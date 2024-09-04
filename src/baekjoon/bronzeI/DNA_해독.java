package baekjoon.bronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* DNA 해독 - 백준 (1672) */
public class DNA_해독 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String bs = br.readLine();

        /* 해독된 최종 염기 */
        String base = "";

        /* 초깃값을 마지막 염기로 설정 */
        base = bs.substring(N - 1);

        /* 두 번째 마지막 염기부터 첫 번째 염기까지 반복 */
        for (int i = N - 2; i >= 0; i--) {
            base += bs.charAt(i);

            if(base.equals("AA") || base.equals("AC") || base.equals("GT") || base.equals("CA") || base.equals("TG")) {
                base = "A";
            } else if(base.equals("AT") || base.equals("GG") || base.equals("CT") || base.equals("TA") || base.equals(
                    "TC")) {
                base = "G";
            } else if(base.equals("AG") || base.equals("GA") || base.equals("CC")) {
                base = "C";
            } else if(base.equals("GC") || base.equals("CG") || base.equals("TT")) base = "T";
        }

        System.out.println(base);

    }

}