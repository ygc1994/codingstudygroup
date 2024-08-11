package baekjoon.bronzeI;

import java.util.Scanner;

public class 더하기_사이클 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        int count = 0;

        num = N;

        do {
            N = N % 10 * 10 + (N / 10 + N % 10) % 10;
            count++;
        } while(num != N);

        System.out.println(count);

    }

}