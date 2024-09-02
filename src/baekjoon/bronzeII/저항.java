package baekjoon.bronzeII;

import java.util.Scanner;

/* 저항 - 백준 (1076) */
public class 저항 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Long[] longarr = new Long[3];

        /* 각각 색에 따른 저항 입력 */
        for (int i = 0; i < longarr.length; i++) {
            switch (sc.nextLine()) {
                case "black": longarr[i] = 0L; break;
                case "brown": longarr[i] = 1L; break;
                case "red": longarr[i] = 2L; break;
                case "orange": longarr[i] = 3L; break;
                case "yellow": longarr[i] = 4L; break;
                case "green": longarr[i] = 5L; break;
                case "blue": longarr[i] = 6L; break;
                case "violet": longarr[i] = 7L; break;
                case "grey": longarr[i] = 8L; break;
                case "white": longarr[i] = 9L; break;
            }
        }

        /* 첫째 자리는 십의 자리, 둘째 자리는 일의 자리의 두 자리 정수를 만든 후, 세 번째 색을 곱해 출력 */
        if(longarr[0] * 10 + longarr[1] == 0L) {
            System.out.println("0");
        } else System.out.println((longarr[0] * 10 + longarr[1]) * (long) Math.pow(10, longarr[2]));

    }

}