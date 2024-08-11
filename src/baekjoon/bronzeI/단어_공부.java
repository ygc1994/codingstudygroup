package baekjoon.bronzeI;

import java.util.Scanner;

public class 단어_공부 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] arr = new int[26];
        int num = 0;
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                arr[str.charAt(i) - 65]++;
            } else {
                arr[str.charAt(i) - 97]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(num < arr[i]) {
                num = arr[i];
                ch = (char) (i + 65);
            } else if(num == arr[i]) {
                ch = '?';
            }
        }

        System.out.println(ch);

    }

}