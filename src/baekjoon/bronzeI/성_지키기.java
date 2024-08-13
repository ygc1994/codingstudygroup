package baekjoon.bronzeI;

import java.util.Scanner;

public class 성_지키기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int num1 = 0;
        int num2 = 0;

        char[][] ch = new char[N][M];

        for (int i = 0; i < ch.length; i++) {
            String str = sc.next();

            for (int j = 0; j < ch[i].length; j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        label:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(ch[i][j] == 'X') continue label;
            }

            num1++;
        }

        label:
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(ch[j][i] == 'X') continue label;
            }

            num2++;
        }

        System.out.println(Math.max(num1, num2));

    }

}